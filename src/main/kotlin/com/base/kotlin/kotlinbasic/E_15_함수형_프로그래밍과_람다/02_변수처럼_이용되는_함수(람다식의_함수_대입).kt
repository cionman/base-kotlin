package com.base.kotlin.kotlinbasic.E_15_함수형_프로그래밍과_람다

val dataVal = 10
// val funVal = fun someFun() {} // 에러 발생

val funVal1 = {
    x1: Int -> println("hello world")
    x1 * 10
    println("result : ${x1 *20}")
}
fun main(args:Array<String>){
    funVal1(10)
}