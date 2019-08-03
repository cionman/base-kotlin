package com.base.kotlin.kotlinbasic.E_02_변수와_함수

fun sum5(a: Int, b: Int): Int{
    var sum = 0
    fun calSum(){
        for(i in a..b){
            sum += i
        }
    }
    calSum()
    return sum
}

fun main(args: Array<String>) {
    val result = sum5(1, 10)
    println(result)
}

