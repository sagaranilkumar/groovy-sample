package com.chase.training.groovy.bean.expando

class ExpandoTest {

	static main(args) {
		def person = new Expando()
		person.name = 'Anil'
		person.id = 123
		person.printdetails = {
			println person.name + person.id
		}
		person.printdetails()
	}
}
