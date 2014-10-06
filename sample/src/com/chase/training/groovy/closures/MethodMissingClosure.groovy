package com.chase.training.groovy.closures

import java.text.NumberFormat


class MethodMissingClosure {
	def exchangeRates = ['GBP':0.501882, 'EUR':0.630159,
		'CAD':1.0127, 'JPY':105.87]
	def conversionType
	def conversionRate
	private loadData() {
		BigDecimal.metaClass.methodMissing = { String methodName, args ->
			conversionType = methodName[2..-1]
			conversionRate = exchangeRates[conversionType]
			if(conversionRate){
				NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US)
				nf.setCurrency(Currency.getInstance(conversionType))
				return nf.format(delegate * conversionRate)
			}
			"No conversion for USD to ${conversionType}"
		}
	}
	static main(args) {
		MethodMissingClosure obj = new MethodMissingClosure();
		obj.loadData();
		println 2500.00.inGBP()
		println 2500.00.inJPY()
		println 2500.00.inXYZ()
	}
}

