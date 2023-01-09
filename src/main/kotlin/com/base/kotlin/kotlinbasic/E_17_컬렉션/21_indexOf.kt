package com.base.kotlin.kotlinbasic.E_17_컬렉션

fun main(args: Array<String>) {
    val list = listOf(1, 6, 5, 3, 4, 8 , 7, 3)

    println("indexOf test : ${list.indexOf(3)}")
    println("indexOfFirst test : ${list.indexOfFirst { it % 2 == 0  }}")
    println("indexOfLast test : ${list.indexOfLast { it % 2 == 0  }}")

}