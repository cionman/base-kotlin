package com.base.kotlin.kotlinbasic.E_02_변수와_함수

infix fun Int.myFun(x: Int): Int{
    return x * x
}

class FunClass{
    infix fun infixFun(a: Int){
        println("infixFun call.....: " + a)
    }
}

fun main(args: Array<String>) {
    val obj = FunClass()
    obj.infixFun(10)
    //중위 표현식
    obj infixFun 10

    println(10 myFun 10)
    println(10.myFun(10))
}

