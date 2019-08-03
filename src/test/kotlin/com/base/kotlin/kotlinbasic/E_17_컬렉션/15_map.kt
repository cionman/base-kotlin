package com.base.kotlin.kotlinbasic.E_17_컬렉션

fun main(args: Array<String>) {
    val list = listOf(6, 5, 3, 4, 8 , 7)


    // map함수는 foreach와 비슷하지만 반환값이 있다.
    println("map test : ${list.map { it * 10 }}")

}