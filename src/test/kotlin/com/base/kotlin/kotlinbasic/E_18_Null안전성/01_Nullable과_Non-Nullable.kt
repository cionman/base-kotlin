package com.base.kotlin.kotlinbasic.E_18_Null안전성

var data1: String = "kkang"
var data2: String? = null

fun main(args: Array<String>) {
    // data1 = null  //Non-Nullable이므로 에러 발생
    // data1 = data2 //Non-Nullable Nullable 대입은 에러 발생
}