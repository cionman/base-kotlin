package com.base.kotlin.kotlinbasic.E_21_제네릭

// class MyClass10<T> 는 class MyClass10<T:Any?> 와 같다.

class MyClass10<T:Any>{
    fun myFun(arg1:T, arg2:T){
        println(arg1.equals(arg2))
    }
}

fun main(args: Array<String>) {
    val obj = MyClass10<String>()
    obj.myFun("hello", "hello")

    //val obj2 = MyClass10<Int?>() // 에러 널 불허 제약

}