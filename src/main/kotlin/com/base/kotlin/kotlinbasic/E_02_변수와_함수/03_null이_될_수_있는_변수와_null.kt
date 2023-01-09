package com.base.kotlin.kotlinbasic.E_02_변수와_함수

//val nonNullData: String = null // null 할당 불가능
val nullableData1: String? = null
var nullableData2: String? = null

fun main(args: Array<String>){
    // nullableData1 = "hello" // val 는 Assign Once
    nullableData2 = "hello"
    println(nullableData2)
}