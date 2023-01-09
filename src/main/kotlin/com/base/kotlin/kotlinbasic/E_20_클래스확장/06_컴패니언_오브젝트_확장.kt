package com.base.kotlin.kotlinbasic.E_20_클래스확장

class Companion{
    companion object{
        val data1: Int = 10
        fun myFun1(){
            println("companion object myFun1()...")
        }
    }
}

val Companion.Companion.data2:Int
    get() = 20

fun Companion.Companion.myFun2(){
    println("extension myfun2...")
}

fun main(args: Array<String>) {
    println("data1 : ${Companion.data1} data2 : ${Companion.data2}")
    Companion.myFun1()
    Companion.myFun2()
}