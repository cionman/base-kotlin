package com.base.kotlin.kotlinbasic.E_10_데이터클래스

data class User3(val name:String, val age:Int)

/**
 * 프로퍼티 대신에 사용할 수 있는 componentN 함수
 */
fun main(args: Array<String>) {
    var user = User3("kkang", 50)
    println(user.component1())
    println(user.component2())
}