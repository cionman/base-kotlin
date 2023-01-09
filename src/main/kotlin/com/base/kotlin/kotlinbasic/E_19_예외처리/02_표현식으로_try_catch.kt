package com.base.kotlin.kotlinbasic.E_19_예외처리

import java.lang.ClassCastException
import java.lang.Exception

fun some1(arg: String):Int{
    val parseData: Int = try{
        println("try...top")
        arg.toInt()
    }catch(e: Exception){
        println("${e.toString()}")
        0
    }finally {
        println("finally...")
        100 //finally 문은 값을 반환하지 않는다.
    }
    return parseData
}

fun main(args: Array<String>) {
    println("${some1("10")}")
    println("${some1("a")}")
}