package com.chase.training.groovy.calc

class Calculator {

	def add(x, y) {
		println "parameter - $x"
		println "parameter - $y"
		x+y
	}

	def sub(x, y) {
		println "parameter - $x"
		println "parameter - $y"
		x-y
	}
	
	static main(args) {
		def calc = new Calculator();
		println calc.add(5,45)
		println calc.class
	}
}
