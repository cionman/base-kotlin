package com.base.kotlin.kotlinbasic.E_08_상속

fun main(args: Array<String>) {
    val obj7:SuperCast? = null
    val obj8:SubCast = obj7 as SubCast  //런타입 에러 발생, null을 캐스팅할 수 없으므로
}