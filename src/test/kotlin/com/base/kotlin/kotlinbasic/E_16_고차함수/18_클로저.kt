package com.base.kotlin.kotlinbasic.E_16_고차함수

fun closureTest(x:Int):(Int) -> Int{
    println("argument $x")
    return {it * x}
}

fun main(args: Array<String>) {
    val someFun1 = closureTest(2)
    val someFun2 = closureTest(3)
    println("${someFun1(10)}")
    println("${someFun2(10)}")
}

