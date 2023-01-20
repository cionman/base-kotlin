package com.base.kotlin.kotlinbasic.E_22_지연초기화

class HelloBot {
    val greeting: String by lazy {
        println("지연초기화")
        getHello()
    }

    fun sayHello() = println(greeting)
}

fun getHello() = "안녕하세요."

fun main() {
    val helloBot = HelloBot()
    helloBot.sayHello()
    helloBot.sayHello()
    helloBot.sayHello()
    helloBot.sayHello()
}