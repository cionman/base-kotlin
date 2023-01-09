package com.base.kotlin.kotlinbasic.E_09_추상클래스와_인터페이스

abstract class Super{
    val data1: Int = 10
    abstract val data2: Int
    fun myFun(){

    }
    abstract fun myFun2()
}

class Sub:Super(){
    override val data2: Int = 10

    override fun myFun2() {

    }
}

fun main(args: Array<String>) {
    //val obj1 = Super() // 추상 클래스는 바로 객체화 시킬 수 없다.
    val obj2 = Sub()
}