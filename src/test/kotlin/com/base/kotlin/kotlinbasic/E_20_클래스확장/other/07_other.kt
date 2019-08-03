package com.base.kotlin.kotlinbasic.E_20_클래스확장.other

class Test{
    val data1: Int = 10
}

val Test.data2
    get() = 20

fun main(args: Array<String>) {
    val obj: Test = Test()
    println("data2 : ${obj.data2}")
}