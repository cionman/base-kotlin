package com.base.kotlin.kotlinbasic.E_17_컬렉션

fun main(args: Array<String>) {
    val list = listOf(6, 5, 3, 4, 8 , 7)

    //특정위치의 값
    println("elementAt test : ${list.elementAt(2)}")
    //위치를 벗어나면 index범위를 벗어나며Exception 발생
    //println("elementAt test : ${list.elementAt(10)}")
    println("elementAtOrElse test : ${list.elementAtOrElse(10, {0})}")
    println("elementAtOrNull test : ${list.elementAtOrNull(10)}")

}