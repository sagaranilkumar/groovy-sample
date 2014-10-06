package com.chase.training.groovy.string

class MultiLineString {
	def static name = "Ur Name"
	static main(args) {
		def multiLineStr = """Hello 
		This is a multiple line string 
		\n\t to be displayed in three lines"""
		println multiLineStr
		
		println multiLineStr.class.name
		multiLineStr = multiLineStr.replace("Hello", "Hello, {$name}")
		println multiLineStr
		println multiLineStr.class.name
	}
}
