package com.base.kotlin.kotlinbasic.E_05_연산자

fun some(vararg a:String){
    val iterator = a.iterator()
    while(iterator.hasNext()){
        println(iterator.next())
    }
}

fun main(args: Array<String>) {
    val array = arrayOf("hello", "world", "!!!")
    some(*array)
}