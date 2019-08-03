package com.base.kotlin.kotlinbasic.E_04_흐름제어_구문

fun testWhen(data: Any) {
    when(data){
        1 -> println("data value is 1")
        "hello" -> println("data value is hello")
        is Boolean -> println("data type is Boolean")
    }
}

fun main(args: Array<String>) {
    testWhen(true)
}