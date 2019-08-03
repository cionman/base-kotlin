package com.base.kotlin.kotlinbasic.E_08_상속

class MyClass1{
    fun fun1(){
        println("fun1() 실행")
    }
}

class MyClass2{
    fun fun2(){
        println("fun2() 실행")
    }
}

fun smartCast2(obj: Any){
    if(obj is MyClass1)
        obj.fun1()
    else if (obj is MyClass2)
        obj.fun2()
}

fun main(args: Array<String>) {
    smartCast2(MyClass1())
    smartCast2(MyClass2())
}