package com.chase.training.groovy.collections


class SpreadOperator {
	static main(args) {
		def javaLang = new Language(lang: "Java")
		def groovyLang = new Language(lang: "Groovy")
		def scalarLang = new Language(lang: "Scalar")

		def list = [javaLang, groovyLang, scalarLang]

		// via closure
		println "*********** via closure ************"
		list.each { it.speak(); }

		// via Spread Operator
		println "*********** via Spread Operator ************"
		list*.speak();
	}
}

class Language {
	def String lang;
	def speak() {
		println "$lang speaks."
	}
}
