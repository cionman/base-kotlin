package com.base.kotlin.kotlinbasic.E_20_클래스확장

import com.base.kotlin.kotlinbasic.E_20_클래스확장.other.Test
import com.base.kotlin.kotlinbasic.E_20_클래스확장.other.data2 //확장멤버는 이렇게 따로 import하지 않으면 사용할 수 없다.

fun main(args: Array<String>) {
    val obj: Test = Test()
    println("data1 : ${obj.data1}")
    println("data2 : ${obj.data2}")
}