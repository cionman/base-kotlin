package com.base.kotlin.kotlinbasic.E_16_고차함수

fun hoFun(x1: Int, argFun:(Int) -> Int){
    val result = argFun(x1)
    println("x1 : $x1, sumFun: $result")
}

fun main(args:Array<String>){
    hoFun(10, {x -> x * x})
    hoFun(15, {x -> x * x + 1})
}

