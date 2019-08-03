package com.base.kotlin.kotlinbasic.E_05_연산자


fun main(args: Array<String>) {
    val list = listOf<String>("hello", "world")
    some(*list.toTypedArray())
}