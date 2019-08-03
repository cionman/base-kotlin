package com.base.kotlin.kotlinbasic.E_05_연산자

/**
 * A === B A와 B가 같은 객체이면 true
 * A !== B A와 B가 다른 객체이면 true
 */
fun main(args: Array<String>) {
    class User
    val user1 = User()
    val user2 = User()
    val user3 = user1

    println("user1 == user2 is ${user1 == user2}")
    println("user1 === user2 is ${user1 === user2}")
    println("user1 == user3 is ${user1 == user3}")
    println("user1 === user3 is ${user1 === user3}")
}