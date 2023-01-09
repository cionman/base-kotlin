package com.base.kotlin.kotlinbasic.E_17_컬렉션

fun main(args: Array<String>) {
    val list = listOf(3, 4, 5, 6, 7, 8)

    // 특정 조건에 모두 만족하면 true
    println("all test1 : ${list.all { it > 2 }}")
    println("all test2 : ${list.all { it > 3 }}")
}