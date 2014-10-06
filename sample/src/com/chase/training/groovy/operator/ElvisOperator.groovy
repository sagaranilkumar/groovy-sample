package com.chase.training.groovy.operator

class ElvisOperator {

	static main(args) {
		def text = "Hello"
		def ternaryResult = text != null ? text : "Default Value"
		println ternaryResult
		
		// Elvis Operator
		def textTest2 = null
		def elvisResult = textTest2 ?: 'Hello Groovy!'
		println elvisResult
		
		def test3 = null
		elvisResult = test3 ?: 'Hello Buddy !'
		println elvisResult
		
		def test4 = "not null"
		elvisResult = test4 ?: 'Hello Buddy !'
		println elvisResult

	}
}
