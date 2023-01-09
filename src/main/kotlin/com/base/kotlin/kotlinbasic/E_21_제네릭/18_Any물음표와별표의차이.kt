package com.base.kotlin.kotlinbasic.E_21_제네릭
/*
스타 프로젝션이란 제네렉 타입을 <*> 표현하는 것을 의미합니다. 스타 프로젝션은 제네렉 타입을 모른다는 의미입니다.
*/

fun main(args: Array<String>) {
    val list2: MutableList<Any?> = mutableListOf(10, 10.0, "kkang")
    list2.forEach { println(it) }

    val list3: MutableList<*> = mutableListOf(10, 10.0, "kkang")
    list3.forEach { println(it) }

    /*val list4: MutableList<Any?> = mutableListOf<Any>(10, 10.0, "kkang") //에러 발생
    list4.forEach { println(it) }

*/
    val list5: MutableList<*> = mutableListOf<Any>(10, 10.0, "kkang")
    list5.forEach { println(it) }
}