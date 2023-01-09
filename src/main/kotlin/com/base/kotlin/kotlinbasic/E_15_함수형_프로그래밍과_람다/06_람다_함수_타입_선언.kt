package com.base.kotlin.kotlinbasic.E_15_함수형_프로그래밍과_람다

val lambdaFun: (Int) -> Int = { x: Int -> x * 10}

fun main(args:Array<String>){
    println("result : ${lambdaFun(5)}")
}