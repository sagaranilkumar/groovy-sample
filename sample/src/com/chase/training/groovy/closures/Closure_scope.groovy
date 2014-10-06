package com.chase.training.groovy.closures
class Mother {
    int field = 1
    int foo(){
        return 2
    }
    Closure birth (param) {                                 //#1
        def local = 3
        def closure = { caller ->
            [this, field, foo(), local, param, caller,this] 
        }
        return closure
    }
	
	static main(args) {
		Mother julia = new Mother()
		
		Closure closure = julia.birth(4)                                    //#2
		
		def context = closure.call(this)                                //#3
		
		println context[0].class.name                               //#4
		
		assert context[1..4] == [1,2,3,4]                           //#5
		assert context[5] instanceof Script                         //#6
		assert context[6] instanceof Mother                         //#7
		
		def firstClosure  = julia.birth(4)                              //#8
		def secondClosure = julia.birth(4)                              //#8
		assert false == firstClosure.is(secondClosure)              //#8
	}
}                    

