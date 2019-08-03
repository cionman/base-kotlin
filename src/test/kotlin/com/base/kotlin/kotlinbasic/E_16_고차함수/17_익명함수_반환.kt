package com.base.kotlin.kotlinbasic.E_16_고차함수

val array2 = arrayOf(1, -1, 2)

fun arrayLoop4(){
    println("loop top..")
    array2.forEach aaa@{
        if(it < 0) return@aaa // arrayLoop함수를 빠져나가게 된다.
        println(it)
    }
    println("loop bottom")
}

fun arrayLoop5(){
    println("loop top..")
    array2.forEach(fun(value:Int){
        if(value < 0) return //익명함수 반환은 익명함수에서만 빠져나간다.
        println(value)
    })
    println("loop bottom")
}

fun main(args: Array<String>) {
    arrayLoop4()
    println("---arrayLoop4() exit ----")
    arrayLoop5()
    println("---arrayLoop5() exit ----")
}


