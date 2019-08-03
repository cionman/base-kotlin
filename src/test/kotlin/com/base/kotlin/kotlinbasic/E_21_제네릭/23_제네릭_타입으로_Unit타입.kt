package com.base.kotlin.kotlinbasic.E_21_제네릭

interface  MyInterface<T>{
    fun myFun():T
}

class MyClass23:MyInterface<String>{
    override fun myFun(): String {
        return "hello"
    }
}

class MyClass232:MyInterface<Unit>{
    override fun myFun() {

    }
}