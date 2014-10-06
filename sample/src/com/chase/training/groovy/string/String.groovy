package com.chase.training.groovy.string

class String {

	static main(args) {
		def name = 'Anilkumar'
		def greeting = "Hello, $name"
		println greeting
		greeting = /Hello, $name/
		println greeting
	}
}
