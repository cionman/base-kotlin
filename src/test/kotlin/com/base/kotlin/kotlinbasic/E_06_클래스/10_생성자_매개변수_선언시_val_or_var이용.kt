package com.base.kotlin.kotlinbasic.E_06_클래스

class User6(val name:String, val age:Int){
    val myName = name

    fun sayHello(){
        println("hello $name")
    }
}

fun main(args: Array<String>) {
    val user = User6("배고파", 30)
    user.sayHello()
}