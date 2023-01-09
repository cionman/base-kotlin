package com.base.kotlin.kotlinbasic.E_03_기초_데이터_타입

fun main(args: Array<String>) {

    val immutableMap1 = mapOf<String, String>(Pair("one", "hello"), Pair("two", "world"))
    println("${immutableMap1.get("one")} .. ${immutableMap1.get("two")}")

    val immutableMap2 = mapOf<String, String>("one" to "hello", "two" to "kkang")
    println("${immutableMap2.get("one")}..${immutableMap2.get("two")}")
}