package com.base.kotlin.kotlinbasic.E_04_흐름제어_구문

fun main(args: Array<String>) {
    val list = listOf<String>("hello", "world", "kkang")
    val array = arrayOf<String>("one", "two", "Three")
    val data4 = "kkang"
    when(data4){
        in list -> println("data4 in list")
        in array -> println("data4 in array")
    }
}