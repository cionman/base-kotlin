package com.base.kotlin.kotlinbasic.E_01_코틀린기본작성법


var sum=0;
fun calSum(){
    for(i in 1..10){
        sum += i
    }
}

fun main(args: Array<String>){
    calSum()
    println(sum)
}