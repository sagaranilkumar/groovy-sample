package com.chase.training.groovy.controlStructures
class Weekday implements Comparable {
    static final DAYS = [
        'Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'
    ]
    private int index = 0    
    Weekday(String day){                                //#1
        index = DAYS.indexOf(day)
    }    
    Weekday next(){
        return new Weekday(DAYS[(index+1) % DAYS.size()])
    }    
    Weekday previous(){
        return new Weekday(DAYS[index-1])               //#2
    }
    int compareTo(Object other){
        return this.index <=> other.index
    }
    String toString(){
        return DAYS[index]
    }
}

def mon = new Weekday('Mon')
def fri = new Weekday('Fri')

def worklog = ''
for (day in mon..fri){                                  //#3
    worklog += day.toString() + ' '
}
println worklog
assert worklog == 'Mon Tue Wed Thu Fri '