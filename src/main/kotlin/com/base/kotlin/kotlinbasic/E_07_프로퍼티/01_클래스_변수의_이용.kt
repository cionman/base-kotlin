package com.base.kotlin.kotlinbasic.E_07_프로퍼티

// 코틀린에서는 자바의 필드 변수를 프로퍼티라 부릅니다. var, val로 선언되는 변수들이 프로퍼티입니다.

class User{
    var name: String = "kkang"
        get() = field //이것이 생략된 형태
        set(value){field = value} //이것이 생략된 형태
    val age: Int = 20
}

fun main(args: Array<String>) {
    val user = User()
    user.name = "kim"
    println("name: ${user.name}")
    println("age: ${user.age}")
}