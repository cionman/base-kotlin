package com.base.kotlin.kotlinbasic.E_15_함수형_프로그래밍과_람다

fun main(args:Array<String>){
    class User(val name: String, val age: Int)

    //기본 람다
    val lambdas1: (User) -> Int = {user:User -> user.age}
    println("lambdas1 return : ${lambdas1(User("kkang1", 33))}")

    //it 참조
    val lambdas2: (User) -> Int = {it.age}
    println("lambdas2 return : ${lambdas2(User("kkang2", 333))}")

    //멤버 참조
    val lambdas3: (User) -> Int = User::age
    println("lambdas3 return : ${lambdas3(User("kkang3", 33333))}")

}
