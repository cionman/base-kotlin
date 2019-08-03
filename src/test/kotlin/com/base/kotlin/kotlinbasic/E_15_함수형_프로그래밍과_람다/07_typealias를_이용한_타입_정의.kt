package com.base.kotlin.kotlinbasic.E_15_함수형_프로그래밍과_람다

typealias MyType = (Int) -> Boolean
val myFunc:MyType = { it > 10}

fun main(args:Array<String>){
    println("result ${myFunc(3)}")
    println("result ${myFunc(12)}")
}
