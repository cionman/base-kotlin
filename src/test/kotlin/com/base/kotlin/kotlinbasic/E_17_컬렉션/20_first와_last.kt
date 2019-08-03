package com.base.kotlin.kotlinbasic.E_17_컬렉션

fun main(args: Array<String>) {
    val list = listOf(1, 6, 5, 3, 4, 8 , 7)

    println("first test1 : ${list.first()}")
    println("first test2 : ${list.first{ it % 3 == 0}}")
    //해당하는 요소를 찾지 못할때 Exception
    //println("first test3 : ${list.first{ it % 11 == 0}}")
    //해당하는 요소를 찾지 못할때 Null
    println("firstOrNull test : ${list.firstOrNull{ it % 11 == 0}}")

    println("last test1 : ${list.last()}")
    println("last test2 : ${list.last{ it % 3 == 0}}")
    println("lastOrNull test : ${list.firstOrNull{ it % 11 == 0}}")

}