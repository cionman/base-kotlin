package com.base.kotlin.kotlinbasic.E_18_Null안전성

class Address{
    val city: String?="seoul"
}

class User{
    val address: Address? = Address()
}

fun main(args: Array<String>) {
    var data1: String? = "kkang"
    var length: Int? = data1?.length

    val user:User? = User()
    println(user?.address?.city) // null 가능일경우에 null체크 연산자 없이 접근 하면 컴파일 에러 발생
}