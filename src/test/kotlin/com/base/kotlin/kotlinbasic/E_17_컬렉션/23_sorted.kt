package com.base.kotlin.kotlinbasic.E_17_컬렉션

class User2(val name:String, val age:Int)
fun main(args: Array<String>) {
    val numberList = listOf(1, 6, 5, 3, 4, 8 , 7, 3)
    val strList = listOf("korea", "america", "china", "france", "germany")
    val userList = listOf(User2("kkang", 35), User2("choi", 15), User2("kim", 53))

    println("sorted test1 : ${numberList.sorted()}")
    println("sorted test2 : ${strList.sorted()}")
    println("sortedDescending test1 : ${numberList.sortedDescending()}")
    println("sortedDescending test2 : ${strList.sortedDescending()}")
    println("sortedBy test 1: ${numberList.sortedBy { it % 3 }}")
    println("sortedBy test 2: ${userList.sortedBy { it.age }.forEach { println("name : ${it.name} age : ${it.age}")   }}")
    println("sortedByDescending test 1: ${numberList.sortedByDescending { it % 3 }}")
    println("sortedByDescending test 2: ${userList.sortedByDescending { it.age }.forEach { println("name : ${it.name} age : ${it.age}")   }}")
}