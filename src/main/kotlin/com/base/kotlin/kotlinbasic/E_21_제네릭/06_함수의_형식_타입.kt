package com.base.kotlin.kotlinbasic.E_21_제네릭

class MyClass6<T, A>{
    var info:T? = null
    var data:A? = null

    fun myFun(arg: T): A?{
        return data
    }
}