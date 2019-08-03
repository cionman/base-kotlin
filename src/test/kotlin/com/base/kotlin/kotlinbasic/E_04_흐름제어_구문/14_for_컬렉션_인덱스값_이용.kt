package com.base.kotlin.kotlinbasic.E_04_흐름제어_구문

fun main(args: Array<String>) {
    val list = listOf<String>("hello", "world", "!")
    for(i in list.indices){
        println(list[i])
    }
}