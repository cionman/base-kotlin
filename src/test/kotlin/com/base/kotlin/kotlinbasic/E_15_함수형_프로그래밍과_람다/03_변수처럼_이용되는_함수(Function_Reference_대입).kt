package com.base.kotlin.kotlinbasic.E_15_함수형_프로그래밍과_람다

fun someFun(){
    println("i am some function")
}

val funVal2 = ::someFun

fun main(args:Array<String>){
    funVal2()
}