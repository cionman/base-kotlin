package com.base.kotlin.kotlinbasic.E_17_컬렉션

fun main(args: Array<String>) {
    val list = listOf(6, 5, 3, 4, 8 , 7)

    // take는 drop의 반대다.
    println("take test : ${list.take(2).forEach { println(it) }}")

    // 조건에 만족하지 않는 데이터가 나오는 지점 전 데이터를 포함한다.
    println("takeWhile test : ${list.takeWhile{ it < 7 }.forEach { println(it) }}")
}