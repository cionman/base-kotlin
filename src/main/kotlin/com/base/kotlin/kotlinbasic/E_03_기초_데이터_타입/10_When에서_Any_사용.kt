package com.base.kotlin.kotlinbasic.E_03_기초_데이터_타입

fun case(obj: Any): String{
    when(obj){
        1 -> return "one"
        "Hello" -> return "안농"
        is Long -> return "Long 타입"
        !is String -> return "문자열 아님"
        else -> return "unknown"
    }
}
fun main(args: Array<String>) {
    println(case(1))
    println(case(10))
}