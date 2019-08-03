package com.base.kotlin.kotlinbasic.E_16_고차함수

fun hoFun6(argFun:(Int) -> Int){
    val result = argFun(10)
    println("x1 : 10, sumFun: $result")
}

fun nameFun(x: Int) :Int{
    return x * 5
}

fun main(args: Array<String>) {
    hoFun6(::nameFun)
}








