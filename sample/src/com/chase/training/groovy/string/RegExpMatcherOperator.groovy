package com.chase.training.groovy.string



class RegExpMatcherOperator {
	static def creditCardNbrPattern = /\d[4]-\d[4]-\d[4]-\d[4]/ 
	
	static main(args) {
		//Matcher Operator =~
		def myMatcher = "cheesecheesecheese" =~ /cheese/
		println myMatcher
		println myMatcher instanceof java.util.regex.Matcher
		
		println "Size : " + myMatcher.size()
		myMatcher.each {
			println it
		}
		
		println myMatcher.grep("chee")
	}

}
