package com.chase.training.groovy.controlStructures
def map = [b:2, a:1]
assert [a:1, b:2, c:3] == [c:3, *:map]
println map.spread()
println (*:map)
println (*:map)
println (*:map)
println (*:map)