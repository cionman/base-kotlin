package com.base.kotlin.kotlinbasic.E_17_컬렉션

fun main(args: Array<String>) {
    val list = listOf(6, 5, 3, 4, 8 , 7)

    // 매개변수로 숫자를 대입하면 앞부분부터 대입한 숫자 갯수만큼 제외하고 추출
    println("drop test : ${list.drop(2).forEach { println(it) }}")

    // 조건에 만족하지 않는 데이터가 나오는 지점 전 데이터를 제외합니다.
    println("dropWhile test : ${list.dropWhile{ it < 7 }.forEach { println(it) }}")
}