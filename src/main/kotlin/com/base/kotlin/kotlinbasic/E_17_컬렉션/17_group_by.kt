package com.base.kotlin.kotlinbasic.E_17_컬렉션

class User(val name:String, val age:Int)

fun main(args: Array<String>) {
    val list = listOf(User("kkang", 33), User("lee", 28), User("kim", 28))

    println("groupBy test : ${list.groupBy { it.age }}")

    list.groupBy { it.age }
            .forEach{
                println("key : ${it.key} ... count : ${it.value}")
                it.value.forEach{
                    println("${it.name}..${it.age}")
                }
            }
}