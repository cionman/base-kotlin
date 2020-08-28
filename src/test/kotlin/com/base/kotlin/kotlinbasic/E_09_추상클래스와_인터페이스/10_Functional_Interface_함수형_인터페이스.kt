package com.base.kotlin.kotlinbasic.E_09_추상클래스와_인터페이스

//함수형 인터페이스 interface 키워드 앞에  fun 키워드가 있다.
fun interface IntPredicate {
    fun accept(i: Int): Int
}

val isEven = IntPredicate { it % 2 }

fun funInterfaceTest(a: IntPredicate){
    println("result : ${a.accept(3)}" )
}

fun main(args: Array<String>) {
    println("Is 7 even? - ${isEven.accept(7)}")
    funInterfaceTest({ it * 5})
}