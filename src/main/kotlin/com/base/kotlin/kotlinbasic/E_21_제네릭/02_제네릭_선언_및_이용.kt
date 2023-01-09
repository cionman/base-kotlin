package com.base.kotlin.kotlinbasic.E_21_제네릭


class MyClass<T>{
    var info:T? = null
}

fun main(args:Array<String>) {
    val obj1 = MyClass<String>()
    obj1.info = "hello"

    val obj2 = MyClass<Int>()
    obj2.info = 3

    println("obj1 : ${obj1.info}, obj2 : ${obj2.info}")
}
