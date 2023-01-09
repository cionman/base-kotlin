package com.base.kotlin.kotlinbasic.E_04_흐름제어_구문

fun main(args: Array<String>) {
    val a = 5

    if(a < 10) println("$a < 10")

    if(a > 0 && a <= 10){
        println("0 < $a <=10")
    }else if(a > 10 && a<=20){
        println("10 < $a <=20")
    }else{
        println("$a > 20")
    }
}