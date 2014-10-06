package com.chase.training.groovy.builders

import groovy.xml.MarkupBuilder

def writer = new StringWriter();
def xmlBuilder = new MarkupBuilder(writer);
xmlBuilder.employees{
	for(value in 1..5) {
		employee {
			RollNbr(id:value)
			Details(name:value.hashCode(), address:value.toString())
		}
	}
}
println writer.toString()
