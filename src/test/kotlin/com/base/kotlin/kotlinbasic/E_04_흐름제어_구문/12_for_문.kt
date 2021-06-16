package com.base.kotlin.kotlinbasic.E_04_흐름제어_구문

fun main(args: Array<String>) {
    var sum: Int = 0
    for(i in 1..10){
        sum += i
    }
    println(sum)

    println("--- 1 ~ 5 까지 ---")
    for(i in 1..5){
        println(i)
    }

    println("--- 6 ~ 0 까지 2씩 감소 ---")
    for(i in 6 downTo 0 step 2){
        println(i)
    }

    println("--- 1 ~ 10 까지 3씩 증가 ---")
    for(i in 1..10 step 3){
        println(i)
    }

    println("--- 1에서 10까지 10 제외 ---")
    for (i in 1 until 10) { // i in [1, 10), 10 is excluded
        println(i)
    }
}
