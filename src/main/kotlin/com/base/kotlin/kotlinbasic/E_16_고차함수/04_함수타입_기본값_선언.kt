package com.base.kotlin.kotlinbasic.E_16_고차함수

fun hoFun3(
        x1 : Int,
        argFun:(Int) -> Int,
        argFun2:(Int) -> Boolean = {  x -> x > 10}
){
}

fun main(args:Array<String>){
    hoFun3(2, {it * it}, {it > 20})
    hoFun3(3, {it * it * it})
}







