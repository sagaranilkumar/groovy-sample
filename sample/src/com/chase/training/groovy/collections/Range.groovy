package com.chase.training.groovy.collections

class Range {

	def static range_inclusive = 5..8
	def static range_exclusive = 5..<8

	static main(args) {
		println range_inclusive
		println range_exclusive
		assert range_inclusive.from == 5
		assert range_exclusive.to ==7
	}
}
