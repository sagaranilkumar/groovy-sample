package com.chase.training.groovy.operator

class SafeNavigationOperator {

	String name;
	int id;
	
	static main(args) {
		SafeNavigationOperator nullObj = null;
		SafeNavigationOperator nullName = new SafeNavigationOperator(name:null, id:20);
		SafeNavigationOperator notNullName = new SafeNavigationOperator(name:"Anil", id:20);
		println "this Name will not print ${nullObj?.name}" 
		println "name is ${nullName.name}?" 
	}
}
