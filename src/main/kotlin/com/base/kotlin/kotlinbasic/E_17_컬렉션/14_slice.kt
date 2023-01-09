package com.base.kotlin.kotlinbasic.E_17_컬렉션

fun main(args: Array<String>) {
    val list = listOf(6,"a", 5, 3, 4, 8 , 7)


    // 인덱스 1번부터 3번까지 구한다.
    println("slice test1 : ${list.slice(1..3)}")
    println("slice test2 : ${list.slice(listOf(0, 2, 4))}")

}