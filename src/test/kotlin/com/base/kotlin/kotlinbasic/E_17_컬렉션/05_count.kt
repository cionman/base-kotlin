package com.base.kotlin.kotlinbasic.E_17_컬렉션

fun main(args: Array<String>) {
    val list = listOf(3, 4, 5, 6, 7, 8)

    println("count test1 : ${list.count { it > 3 }}")
    println("count test2 : ${list.count { it > 7 }}")
}