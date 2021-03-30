package com.example.no1

//class student(val sno: String, val grade: Int, name:String, age: Int) : Person(name, age){
////    var sno = ""
////    var grade = 0
//
////    init {
////        println("sno is  $sno")
////        println("grade is  $grade")
////    }
//    constructor(name: String, age: Int) : this("", 0, name, age) {
//
//    }
//    constructor() : this("",0) {
//
//    }
//}

class student(name:String, age: Int) : Person(name, age), Study {
    override fun readBooks() {
        println("$name is reading.")
    }
//    override fun doHomewwork() {
//        println("$name is doing homework.")
//    }
}
