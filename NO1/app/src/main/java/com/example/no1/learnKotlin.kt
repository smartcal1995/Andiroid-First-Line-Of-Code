package com.example.no1

import kotlin.math.max

fun main() {
//    val a = 37
//    val b = 40
//    val value = largerNumber(a, b)
////    println("larger number is $value")
//    val num = 10L
//    checkNumber(num)
//    for (i in 0 until 10 step 2){
//        println(i)
//    }
//    for (i in 10 downTo 1){
//        println(i)
//    }
//    val p = Person()
//    p.name = "Jack"
//    p.age = 10
//    p.eat()
//    val stu = student("a123", 5, "jack", 10)
//    val stu1 = student()
//    val stu2 = student("Jack", 19)
//    val stu3 = student("a123", 5, "jack", 10)
//    stu.eat()
//    doStudy(stu2)
//    val cellPhone1 = cellPhone("Huawei", 9999.9)
//    val cellPhone2 = cellPhone("Samsung", 8888.8)
//    println(cellPhone1)
//    println("phone price = " + (cellPhone1 == cellPhone2))

//    Singleton.singletonTest()

    val list = listOf("apple", "banana", "orange", "pear", "grape", "watermelon")
    var maxLengthFruit = list.maxBy { it.length }
    println("max length fruit is $maxLengthFruit" )
    var newList = list.filter { it.length <= 5 } .map { it.toUpperCase() }
    for (fruit in newList) {
        println(fruit)
    }

}
fun doStudy(study: Study){
    study.doHomewwork()
    study.readBooks()
}


//fun largerNumber(num1: Int, num2: Int) = max(num1, num2)
fun largerNumber(num1: Int, num2: Int) = if(num1 < num2) num1 else num2
fun checkNumber(num: Number) {
    when (num) {
        is Int -> println("INT")
        is Double -> println("Double")
        else -> println("no support")
    }
}