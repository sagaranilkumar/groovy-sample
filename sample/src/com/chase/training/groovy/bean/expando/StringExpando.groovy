package com.chase.training.groovy.bean.expando

class StringExpando {

	static main(args) {
		String.metaClass.capitalize = {
			println delegate
			delegate[0].toUpperCase()+delegate[1..<(delegate.length())].toLowerCase()
		}
		String str = "hELLO"
		println str.capitalize()
		
		println String.metaClass.respondsTo(str, 'capitalize');
		
		println String.metaClass.respondsTo(str, 'indexOf', Integer.class)
	}
}
