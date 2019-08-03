package com.base.kotlin.kotlinbasic.E_15_함수형_프로그래밍과_람다

fun superFun(){
    val superData = "hello"
    fun subFun1(){
        println("subFun1() ... superData : ${superData}")
    }
    fun subFun2(a: Int, b: Int): Int{
        subFun1()
        return a + b
    }

    class SubClass{
        fun classFun(){
            println("classFun().. superData : ${superData}")
        }
    }

    subFun1()
    SubClass().classFun()
}

fun main(args:Array<String>){
    superFun()
}