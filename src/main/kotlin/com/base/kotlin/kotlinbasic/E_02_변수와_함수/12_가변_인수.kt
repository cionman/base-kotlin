package com.base.kotlin.kotlinbasic.E_02_변수와_함수

fun <T> 가변인수함수(a1: Int, vararg  array:T){
    for(a in array){
        println(a)
    }
}

fun <Int>가변인수함수2(a1: Int, vararg  array:Int){
    for(a in array){
        println(a)
    }
}

fun main(args: Array<String>) {
    가변인수함수(10, "안녕", "Hello", "곤니치와")
    가변인수함수(10, 10, "안녕", false)
    가변인수함수2(20, 30, 40, 50, 60)
}