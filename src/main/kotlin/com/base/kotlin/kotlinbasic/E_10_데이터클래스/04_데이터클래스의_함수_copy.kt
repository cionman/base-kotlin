package com.base.kotlin.kotlinbasic.E_10_데이터클래스

data class User4(val name:String, val age:Int)

/**
 * 객체의 데이터를 copy해서 새로운 객체를 생성한다.
 */
fun main(args: Array<String>) {
    var user1 = User4("kkang", 50)
    println(user1.toString())
    var user2 = user1.copy(name = "kim")
    println(user2.toString())

}