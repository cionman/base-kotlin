package com.base.kotlin.kotlinbasic.E_09_추상클래스와_인터페이스

interface MyInterface{
    var data1: String
    fun myFun1() {
        println("myFun1")
    }
    fun myFun2()
}

class MyClass:MyInterface{ // 인터페이스는 클래스가 아니므로 생성자가 없다.

    override var data1: String = "22"

    override fun myFun2() {
    }

    override fun myFun1() {
    }
}