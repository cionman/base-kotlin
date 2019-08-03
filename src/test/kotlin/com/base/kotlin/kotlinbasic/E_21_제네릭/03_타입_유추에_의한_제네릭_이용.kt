package com.base.kotlin.kotlinbasic.E_21_제네릭


class MyClass2<T>(no:T){
    var info:T? = null
}

fun main() {
    val obj3 = MyClass2<Int>(10)
    obj3.info = 20
    val obj4 = MyClass2("hello")
    //obj4.info = 30 // 에러 발생, 타입유추에 의한 제네릭이용
    obj4.info = "hello"
}