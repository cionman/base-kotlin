package com.base.kotlin.kotlinbasic.E_17_컬렉션

fun main(args: Array<String>) {
    val list = listOf(3, 4, 5, 6, 7, 8)
    println("filter list test : ${list.filter { it > 5 }}")
    println("filterNot list test : ${list.filterNot { it > 5 }}")

    val list2 = listOf(3, null, 5, null, 7, 8)
    println("filterNotNull list2 test : ${list2.filterNotNull()}")

    val map = mapOf<String, Int>("one" to 15, "two" to 5 , "three" to 7)
    println("filter map test : ${map.filter { it.value > 5 }}")

}