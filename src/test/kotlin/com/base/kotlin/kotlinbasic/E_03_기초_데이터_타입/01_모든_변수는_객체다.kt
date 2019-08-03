package com.base.kotlin.kotlinbasic.E_03_기초_데이터_타입

/**
 * 코틀린에서는 기초타입이 없다. 모든 타입은 객체다.  int도 객체타입으로 바로 함수에 접근이 가능하다.
 */
val intData : Int = 10
val result = intData.minus(5)

fun main(args: Array<String>) {
    println(result)
}