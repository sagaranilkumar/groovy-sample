package com.chase.training.groovy.interceptable

import groovy.lang.GroovyInterceptable

class MyInterceptable implements GroovyInterceptable {
	def sayHello(name){
		"Hello, ${name}"
	}
	def invokeMethod(String name, args) {
		System.out.println ("Beginning $name")
		def metaMethod = metaClass.getMetaMethod(name, args)
		def result = metaMethod.invoke(this, args)
		System.out.println ("Completed $name")
		return result
	}
	static main(args) {
		MyInterceptable myObj = new MyInterceptable()
		println myObj.sayHello("Sang Shin")
	}
}

