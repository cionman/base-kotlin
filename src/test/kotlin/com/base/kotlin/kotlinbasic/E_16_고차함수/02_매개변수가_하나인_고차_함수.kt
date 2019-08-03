package com.base.kotlin.kotlinbasic.E_16_고차함수

fun hoFun1(argFun:(Int) -> Int){
    val result = argFun(10)
    println("x1 : 10, sumFun: $result")
}



fun main(args:Array<String>){
    hoFun1({x -> x * x})
    hoFun1{x -> x * x + 1} //( ) 생략 가능
    val array = arrayOf(10, 20, 15, 11,8)

    array.filter { x -> x >10 } // ( ) 생략 케이스
            .forEach{ x -> println("x : $x")}
}



