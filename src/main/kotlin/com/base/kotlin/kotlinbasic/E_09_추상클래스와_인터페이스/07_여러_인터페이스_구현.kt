package com.base.kotlin.kotlinbasic.E_09_추상클래스와_인터페이스


interface MyInterface4{
    fun myFun4()
}

interface MyInterface5{
    fun myFun5()
}

class MyClass2 : MyInterface4, MyInterface5{
    override fun myFun4() {
    }

    override fun myFun5() {
    }

}