package com.base.kotlin.kotlinbasic.E_04_흐름제어_구문

fun main(args: Array<String>) {
    var x = 0
    var sum = 0
    while(x < 10){
        sum += ++x
    }
    println(sum)
}