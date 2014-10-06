package com.chase.training.groovy.string



class RegExpPatternOperator {
	//Pattern Operator ~String
	static def pattern = ~/foo/ //creates a pattern from string 
	
	static main(args) {
		def myMatcher = "this is not food"
		println pattern instanceof java.util.regex.Pattern
		
		println pattern.matcher("hello").matches()
		println pattern.matcher("oo").matchesPartially()
	}

}
