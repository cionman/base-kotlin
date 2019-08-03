package com.base.kotlin.kotlinbasic.E_15_함수형_프로그래밍과_람다

val sum1 = { x1: Int, x2: Int -> x1 + x2}
fun main(args: Array<String>){
    val result1 = sum1(10, 20)
    println("result1 : $result1")
}

