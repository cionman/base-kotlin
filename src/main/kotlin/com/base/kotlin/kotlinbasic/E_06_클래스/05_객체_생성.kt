package com.base.kotlin.kotlinbasic.E_06_클래스

class CreateObject{
    var name: String = "world"
    fun sayHello(){
        println("hello $name")
    }
}

fun main(args: Array<String>) {
    val obj1 = CreateObject()
    val obj2 = CreateObject()

    obj1.sayHello()

    obj2.name = "감자"
    obj2.sayHello()
}