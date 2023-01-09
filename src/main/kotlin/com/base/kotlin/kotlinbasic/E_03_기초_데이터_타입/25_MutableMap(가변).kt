package com.base.kotlin.kotlinbasic.E_03_기초_데이터_타입

fun main(args: Array<String>) {
    val mutableMap = mutableMapOf<String,String>()
    mutableMap.put("one", "hello")
    mutableMap.put("two", "world")

    println("${mutableMap.get("one")} .. ${mutableMap.get("two")}")
}