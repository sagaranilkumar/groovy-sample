package com.chase.training.groovy.collections

class List {
	static main(args) {
		def list = [2, 4, 'Hello', 5f, 5d.naN]
		println list.class
		println list.size()
		list.add("newObject");
		println list
		list << 8
		println list
	}

}
