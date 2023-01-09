package com.base.kotlin.kotlinbasic.E_17_컬렉션

fun main(args: Array<String>) {
    val list = listOf(3, 4, 5, 6, 7, 8)

    println("max test : ${list.maxOrNull()}")
    println("min test : ${list.minOrNull()}")
    println("maxBy test : ${list.maxByOrNull { it * 5 / 3 }}")
    println("maxBy test : ${list.minByOrNull { it * 5 / 3 }}")




}