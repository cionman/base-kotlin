package com.base.kotlin.kotlinbasic.E_19_예외처리

import java.lang.ClassCastException
import java.lang.Exception

fun some2(arg: Int):Int{
    if(arg < 1)
        throw Exception("parameter must be greater then zero")
    else{
        var sum = 0
        for(i in 1.. arg){
            sum += 1
        }
        return sum
    }
}


fun main(args: Array<String>) {
    try {
        println("${some2(5)}")
        println("${some2(-1)}")
        println("main bottom")
    } catch (e: Exception) {
        println("Exception ... ${e.toString()}")
    }
}