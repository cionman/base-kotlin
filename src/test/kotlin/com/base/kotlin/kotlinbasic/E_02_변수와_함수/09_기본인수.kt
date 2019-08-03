package com.base.kotlin.kotlinbasic.E_02_변수와_함수

fun sayHello(name: String = "kkang"){
    println("Hello!!" + name)
}

fun main(args: Array<String>) {
    sayHello()
    sayHello("Kim")
}
