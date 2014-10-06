package com.chase.training.groovy.controlStructures
if (true)        assert true
else             assert false

if (1) {
    assert true
} else {
    assert false
}    

if ('non-empty') assert true
else if (['x'])  assert false
else             assert false

if (0)           assert false
else if ([])     assert false
else             assert true


def list
if(!list)
	println 'List is empty or null'