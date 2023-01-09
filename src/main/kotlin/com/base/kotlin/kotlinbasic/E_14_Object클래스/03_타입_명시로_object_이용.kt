package com.base.kotlin.kotlinbasic.E_14_Object클래스

interface SomeInterface{
    fun interfaceFun()
}

open class SomeClass{
    fun someClassFun(){
        println("someClassFun...")
    }
}

class Outer3{
    val myInner: SomeClass = object:SomeClass(), SomeInterface{
        override fun interfaceFun() {
            println("interfaceFun .....")
        }
    }

}

fun main(args: Array<String>){
    val obj = Outer3()
    obj.myInner.someClassFun()
}