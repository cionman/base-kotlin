package com.base.kotlin.kotlinbasic.E_04_흐름제어_구문
fun some() = 77

fun main(args: Array<String>) {
    val data = 30
    when(data){
        10, 20 -> println("data is 10 or 20")
        30, 40 -> println("data is 30 or 40")
        some() -> println("data is some result")
    }
}