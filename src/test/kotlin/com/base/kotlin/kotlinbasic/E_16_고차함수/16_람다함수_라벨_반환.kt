package com.base.kotlin.kotlinbasic.E_16_고차함수

val array = arrayOf(1, -1, 2)
fun arrayLoop(){
    println("loop top..")
    array.forEach{
        if(it < 0) return // arrayLoop함수를 빠져나가게 된다.
        println(it)
    }
    println("loop bottom")
}

fun arrayLoop2(){
    println("loop top..")
    array.forEach aaa@{
        if(it < 0) return@aaa // arrayLoop함수를 빠져나가게 된다.
        println(it)
    }
    println("loop bottom")
}

fun arrayLoop3(){
    println("loop top..")
    array.forEach{
        if(it < 0) return@forEach // 자동라벨
        println(it)
    }
    println("loop bottom")
}

fun main(args: Array<String>) {
    arrayLoop()
    println("---arrayLoop() exit ----")
    arrayLoop2()
    println("---arrayLoop2() exit ----")
    arrayLoop3()
    println("---arrayLoop3() exit ----")
}


