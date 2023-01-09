package com.base.kotlin.kotlinbasic.E_16_고차함수

class User2{
    var name: String? = null
    var age: Int? = null

    fun sayHello(){
        println("hello $name")
    }

    fun sayInfo(){
        println("i am $name, $age years old")
    }
}

fun main(args: Array<String>) {
    val user = User2()
    // run 함수는 전달 받은 람다함수의 반환값을 그대로 반환하지만 apply함수는 apply를 적용한 객체를 반환
    val user3 = user.apply {
        name = "park"
        sayHello()
        sayInfo()
    }
    println("user name : ${user.name}, user3 name : ${user3.name}")
    user.name = "aaa"
    user3.name = "bbb"
    println("user name : ${user.name}, user3 name : ${user3.name}")


}




