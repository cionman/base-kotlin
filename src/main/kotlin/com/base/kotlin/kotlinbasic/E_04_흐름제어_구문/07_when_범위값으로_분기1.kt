package com.base.kotlin.kotlinbasic.E_04_흐름제어_구문

fun main(args: Array<String>) {
    val data3 = 15
    when(data3){
        !in 1..100 -> println("잘못된 데이터")
        in 1..10 -> println("1 <= data3 <= 10")
        in 11..20 -> println("11 <= data3 <= 20")
        else -> println("data3 > 20")
    }
}