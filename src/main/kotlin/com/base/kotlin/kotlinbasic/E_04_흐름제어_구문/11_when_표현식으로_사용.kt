package com.base.kotlin.kotlinbasic.E_04_흐름제어_구문

fun main(args: Array<String>) {
    val data = 3
    val result = when(data){
        1 -> "1이다"
        2 -> "2이다"
        3 -> "3이다"
        else -> "3보다 큰 숫자일걸 아닐수도"
    }
    println(result)
}