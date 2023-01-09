package com.base.kotlin.kotlinbasic.E_17_컬렉션

fun main(args: Array<String>) {
    val list = listOf(6, 5, 3, 4, 8 , 7)

    println("map test : ${list.mapIndexed { index, value -> index * value }}")

}