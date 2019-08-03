package com.base.kotlin.kotlinbasic.E_21_제네릭

class MyClass4<T, A>{
    var info: T? = null
    var data: A? = null
}

fun main() {
    val obj:MyClass4<String, Int> = MyClass4()
    obj.info = "hello"
    obj.data = 10
}

