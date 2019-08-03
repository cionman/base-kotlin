package com.base.kotlin.kotlinbasic.E_17_컬렉션

fun main(args: Array<String>) {
    val list = listOf(3, 4, 5, 6, 7, 8)

    //만족하는게 없으면 true
    println("none test1 : ${list.none { it > 8 }}")
    println("none test2 : ${list.none { it > 7 }}")




}