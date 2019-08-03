package com.base.kotlin.kotlinbasic.E_21_제네릭
/*
 코틀린의 Unit는 자바의 void와 비교되며 같은 역할을 하고 있음,  Unit이 가장 많이 사용되는 곳은 함수의 반환 타입
 하지만 자바의 void는 예약어인데 반해, 코틀린의 Unit는 타입
 */

fun myfun1(){} // 자동으로 반환 타입이 Unit로 지정됨
fun myfun2():Unit {}
fun myfun3():Unit{ return Unit}

val myval: Unit = Unit
fun main(args: Array<String>) {
    println(myfun1())
}