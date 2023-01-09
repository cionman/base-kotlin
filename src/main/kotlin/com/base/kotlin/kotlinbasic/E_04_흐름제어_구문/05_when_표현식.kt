package com.base.kotlin.kotlinbasic.E_04_흐름제어_구문

fun main(args: Array<String>) {
    val a = 1
    when(a){
        1 -> println("a2 == 1")
        2 -> println("a2 == 2")
        else ->{
            println("a2 is neither 1 nor 2")
        }
    }
}