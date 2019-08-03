package com.base.kotlin.kotlinbasic.E_20_클래스확장

import com.base.kotlin.kotlinbasic.E_20_클래스확장.other.Test
import com.base.kotlin.kotlinbasic.E_20_클래스확장.other.data2 //확장멤버는 이렇게 따로 import하지 않으면 사용할 수 없다.

class ExtensionClass2{
    fun myFun(){
        println("ExtensionClass myFun()")
    }
}

class DispatchClass2{
    fun myFun(){
        println("DispatchClass dispatchFun()")
    }

    fun ExtensionClass2.some(){
        myFun()
        this.myFun()
        this@DispatchClass2.myFun() // 확장함수와 함수명이 중복인 경우
    }

    fun test(){
        val obj:ExtensionClass2 = ExtensionClass2()
        obj.some()
    }
}

fun main(args: Array<String>) {
    val obj: DispatchClass2 = DispatchClass2()
    obj.test()

}