package com.base.kotlin.kotlinbasic.E_09_추상클래스와_인터페이스

interface MyInterface1 {
    fun myFun1()
}

interface MyInterface2{
    fun myFun2()
}


interface MyInteface3 : MyInterface1, MyInterface2{
    fun myFun3()
}

class MyClass1: MyInteface3{
    override fun myFun1() {
    }

    override fun myFun2() {
    }

    override fun myFun3() {
    }

}