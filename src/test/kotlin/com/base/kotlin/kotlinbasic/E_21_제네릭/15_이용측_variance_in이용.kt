package com.base.kotlin.kotlinbasic.E_21_제네릭

/*
 Variance는 선언측과 이용측으로 나누어짐
 */

class MyClass15<T>(val data: T){

}

fun some15(arg:MyClass15<in Int>){

}

fun main(args: Array<String>) {
    some15(MyClass15<Int>(10))
    some15(MyClass15<Number>(10))
}