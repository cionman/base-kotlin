package com.base.kotlin.kotlinbasic.E_17_컬렉션

fun main(args: Array<String>) {
    val list = listOf(3, 4, 5, 6, 7, 8)

    // 만족하는 첫번째 데이터 반환
    println("find test1 : ${list.find { it > 3 }}")
    println("find test2 : ${list.find { it > 7 }}")
}