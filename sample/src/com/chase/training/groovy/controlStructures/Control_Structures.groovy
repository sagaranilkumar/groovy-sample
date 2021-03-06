package com.chase.training.groovy.controlStructures
myList = ['a', 'b', 'c']

assert myList.isCase('a')
candidate = 'a'
switch(candidate){
    case myList : assert true; break        //#1
    default     : assert false
}

assert ['x','a','z'].grep(myList) == ['a']  //#2

myList = []
if (myList) assert false                    //#3

// Lists can be iterated with a 'for' loop
log = ''
for (i in [1,'x',5]){                       //#4
    log += i
}
assert log == '1x5'

def caseParam = 5
switch(caseParam) {
	case 1 : println 'this is case 1';break
	case 2.0 : println 'this is case 2.0'; break
	case [1, 5] : println 'this is case[1,2]'; break
}
