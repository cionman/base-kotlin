package com.base.kotlin.kotlinbasic.E_03_기초_데이터_타입

fun main(args: Array<String>) {
    var array:Array<Any> = arrayOf(1, "kkang", true)
    array[0] = 10
    array[2] = "world"
    println("${array[0]}.. ${array[1]}.. ${array[2]}")
    println("size : ${array.size}, ${array.get(0)}, ${array.get(1)}")
}


