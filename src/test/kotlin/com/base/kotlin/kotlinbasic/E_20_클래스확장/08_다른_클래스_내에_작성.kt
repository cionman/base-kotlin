package com.base.kotlin.kotlinbasic.E_20_클래스확장

import com.base.kotlin.kotlinbasic.E_20_클래스확장.other.Test
import com.base.kotlin.kotlinbasic.E_20_클래스확장.other.data2 //확장멤버는 이렇게 따로 import하지 않으면 사용할 수 없다.

class ExtensionClass{
    fun some1(){
        println("ExtensionClass some1()")
    }
}

class DispatchClass{
    fun dispatchFun(){
        println("DispatchClass dispatchFun()")
    }

    fun ExtensionClass.some2(){
        some1()
        dispatchFun()
    }

    fun test(){
        val obj:ExtensionClass = ExtensionClass()
        obj.some1()
        obj.some2()
    }
}

fun main(args: Array<String>) {
    val obj: ExtensionClass = ExtensionClass()
    obj.some1()
    //obj.some2() //  에러 발생, 확장 구문이  DispatchClass 내부에 정의 된 것이므로 DispatchClass내부에서만 확장함수가 적용되고 외부에서는 적용되지 않음

}