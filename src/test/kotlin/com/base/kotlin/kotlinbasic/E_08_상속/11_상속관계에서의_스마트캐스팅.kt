package com.base.kotlin.kotlinbasic.E_08_상속

open class SuperCast{
    fun superFun(){
        println("SuperCast superFun 실행")
    }
}

class SubCast:SuperCast(){
    fun subFun(){
        println("SubCast subFun 실행")
    }
}

fun main(args: Array<String>) {
    val obj1 : SuperCast = SubCast() // 하위타입은 상위타입에 자동 캐스팅
    val obj2 : SubCast = obj1 as SubCast

    obj1.superFun()
    obj2.subFun()
}