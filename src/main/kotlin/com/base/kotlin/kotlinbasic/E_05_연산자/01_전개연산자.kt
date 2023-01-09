package com.base.kotlin.kotlinbasic.E_05_연산자

import java.util.Arrays.asList

/**
 * 전개 연산자는 차례대로 나열한다.
 */
fun main(args: Array<String>) {
    val array = arrayOf(10, 20, 30)
    val list = asList(1, 2, *array, 100, 200)
    list.forEach({ println(it)})
}