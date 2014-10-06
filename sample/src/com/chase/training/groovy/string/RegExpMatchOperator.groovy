package com.chase.training.groovy.string

class RegExpMatchOperator {
	static def creditCardNbrPattern = /\d[4]-\d[4]-\d[4]-\d[4]/ 
	
	static main(args) {
		//Match Operator ==~
		println "something" ==~ /something/
		// ^-> start of, $-> end of
		println"something" ==~ /.*g$/ // ending char is g
		println"something" ==~ '.*g$' // ending char is g
		println"something" ==~ '.*s$' // ending char is not s
		println"something" ==~ '^s.*$' // start char is s
		
	}

}
