package com.base.kotlin.kotlinbasic.E_02_변수와_함수

//코틀린은 Assign-once(val)와 Mutable(var) 함수로 구분된다.

val data1: Int = 10
val data2 = 20
var data3 = 30

fun main(args:Array<String>){
    // data2 = 40 // 에러 발생한다.
    data3 = 40
    println(data3)
}