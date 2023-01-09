package com.base.kotlin.kotlinbasic.E_07_프로퍼티

class User1{
    var greeting: String = "hello"
        set(value) {
            field = "Hello" + value
        }
        get() = field.toUpperCase()

    var age: Int = 0
        set(value){
            if(value > 0){
                field = value
            }else{
                field =0
            }
        }
}

fun main(args: Array<String>) {
    val user1 = User1()
    user1. greeting = "kkang"
    println(user1.greeting)
    user1.age = -1
    println("age : ${user1.age}")
}