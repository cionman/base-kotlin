package com.base.kotlin.kotlinbasic.E_20_클래스확장

class Super{
    val superData: Int = 10
    fun superFun(){
        println("superFun ....")
    }
}

val Super.subData: Int
    get() = 20

fun Super.subFun(){
    println("subFun .....")
}

fun main(args: Array<String>) {
    val obj:Super = Super()
    println("superData : ${obj.superData}, subData: ${obj.subData}")
    obj.superFun()
    obj.subFun()
}