package com.base.kotlin.kotlinbasic.E_04_흐름제어_구문

fun main(args: Array<String>) {
    val data5 = 15
    when{
        data5 <= 10 -> println("data5 < 10")
        data5 > 10 && data5 <=20 -> println("10 < data5 <20")
        else -> println("data5 >20")
    }
}