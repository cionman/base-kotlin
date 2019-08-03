package com.base.kotlin.kotlinbasic.E_02_변수와_함수

var myBool = false
val myVal: String = "hello"
    get(){
        if(myBool)
            return field
        else
            return field.toUpperCase()
    }

fun main(args: Array<String>) {
    println(myVal)
    myBool = true
    println(myVal)
}