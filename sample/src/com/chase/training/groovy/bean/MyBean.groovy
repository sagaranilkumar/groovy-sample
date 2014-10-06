package com.chase.training.groovy.bean

class MyBean {
	private String privateStr = "Private access String"
	String defaultStr = "Default type String"
	def defaultDefStr ="UnTyped String"
	
	private def doSomething() {
		"This is a private method, should not be accessed outside this class"
	}
}
