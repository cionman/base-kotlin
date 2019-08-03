package com.base.kotlin.kotlinbasic.E_21_제네릭

/*
  제네릭 타입을 실행 시점에 알아내서 as와 is 연산자가 정상적으로 동작하게 할 수는 없을까?
  reified 키워드를 이용하면 가능
*/

inline fun <reified T> some(arg: Any){
    if(arg is T){
        println("true")
    }else{
        println("false")
    }
}

fun main(args: Array<String>) {
    some<String>("hello")
    some<Int>("hello")
}