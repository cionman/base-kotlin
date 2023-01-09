package com.base.kotlin.kotlinbasic.E_03_기초_데이터_타입

/**
 * 불변 List는 set, add 함수를 제공하지 않음
 */
fun main(args: Array<String>) {
    val immutableList: List<String> = listOf("Hello", "World")
    println("${immutableList.get(0)}.. ${immutableList.get(1)}")
}