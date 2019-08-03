package com.base.kotlin.kotlinbasic.E_16_고차함수

fun hoFun2(no:Int, argFun:(Int) -> Int, argFun2: (Int) -> Boolean){
}



fun main(args:Array<String>){
    hoFun2(10, {it * it}, {it > 10})
    hoFun2(10, {it * it}){it > 10} // 맨마지막 인수만 바깥에서 작성 가능
    //hoFun2(10){it * it}{it > 10} // 에러, 맨마지막 인수만 바깥에서 작성 가능하므로 에러 발생
}



