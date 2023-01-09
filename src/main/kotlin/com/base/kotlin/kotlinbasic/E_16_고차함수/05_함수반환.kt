package com.base.kotlin.kotlinbasic.E_16_고차함수

fun hoFun5(str: String): (x1: Int, x2: Int ) -> Int{
    when(str){
        "-" -> return {x1, x2 -> x1 - x2}
        "*" -> return {x1, x2 -> x1 * x2}
        "/" -> return {x1, x2 -> x1 / x2}
        else -> return { x1, x2 -> x1 + x2}
    }
}

fun main(args: Array<String>) {
    println("result : ${hoFun5("*")(5,3)}")
}








