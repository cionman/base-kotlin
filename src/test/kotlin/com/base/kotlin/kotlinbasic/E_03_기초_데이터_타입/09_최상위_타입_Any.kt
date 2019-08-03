package com.base.kotlin.kotlinbasic.E_03_기초_데이터_타입

fun getLength(obj: Any): Int{
    if(obj is String){
        return obj.length
    }
    return 0
}

fun main(args: Array<String>) {
    println(getLength("Hello"))
    println(getLength(10))
}