package com.base.kotlin.kotlinbasic.E_17_컬렉션

fun main(args: Array<String>) {
    val list = listOf(3, 4, 5, 6, 7, 8)

    // 특정 조건에 하나라도 만족하면 true
    println("any test1 : ${list.any { it > 3 }}")
    println("any test2 : ${list.any { it > 9 }}")
}