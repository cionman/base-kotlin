package com.base.kotlin.kotlinbasic.E_05_연산자

//코틀린은 삼항연산을 제공하지 않는다.대신에 if 식으로 대체

fun main(args: Array<String>) {
    val data = 15
    val result = if(data > 10) "big" else "small"

    println("result: $result")
}