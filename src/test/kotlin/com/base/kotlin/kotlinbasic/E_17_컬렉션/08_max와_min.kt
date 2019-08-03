package com.base.kotlin.kotlinbasic.E_17_컬렉션

fun main(args: Array<String>) {
    val list = listOf(3, 4, 5, 6, 7, 8)

    println("max test : ${list.max()}")
    println("min test : ${list.min()}")
    println("maxBy test : ${list.maxBy { it * 5 / 3 }}")
    println("maxBy test : ${list.minBy { it * 5 / 3 }}")




}