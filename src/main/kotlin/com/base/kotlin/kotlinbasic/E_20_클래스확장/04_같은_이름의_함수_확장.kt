package com.base.kotlin.kotlinbasic.E_20_클래스확장

class Test{
    fun sayHello(){
        println("Test..sayHello")
    }
}

fun Test.sayHello(){
    println("Test extension.. sayHello()")
}

fun main(args: Array<String>) {
    val test = Test()
    test.sayHello() // 같은 이름의 함수인 경우 클래스 내부 함수가 우선이다.
}