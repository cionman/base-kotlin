package com.base.kotlin.kotlinbasic.E_04_흐름제어_구문

fun main(args: Array<String>) {
    val a = 5
    val result = if(a < 10){
        println("hello...")
        10 + 20
    }else{
        println("world...")
        20 + 20
    }
}