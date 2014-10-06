package com.chase.training.groovy.closures

class HelloWorld {

	def helloWorld = { 
		println "Hello World!"
	}
	
	static main(args) {
		HelloWorld instance =  new HelloWorld();
		instance.helloWorld()
	}
}


//def myClosure = {println "closure => " + it }
//
//myClosure("inline closure")
//
//def closureAsParam(closure) {
//	closure("closure as parameter")
//}
//
//def closureAsReturn() {
//	myClosure
//}
//
//def x = closureAsReturn()
//x "closure as return"