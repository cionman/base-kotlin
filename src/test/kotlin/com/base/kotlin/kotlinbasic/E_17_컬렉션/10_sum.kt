package com.base.kotlin.kotlinbasic.E_17_컬렉션

fun main(args: Array<String>) {
    val list = listOf(3, 4, 5, 6, 7, 8)

    println("sum test : ${list.sum()}")
    println("sumBy test : ${list.sumBy { it + 2 }}")

}