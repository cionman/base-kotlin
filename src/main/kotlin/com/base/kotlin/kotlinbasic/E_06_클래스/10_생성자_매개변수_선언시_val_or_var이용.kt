package com.base.kotlin.kotlinbasic.E_06_클래스

/**
 * 기본 생성자에 val나 var를 붙이지 않는 생성자 변수는 클래스 필드에서는 사용이 가능하나 메소드에서는 사용할수 없다.
 * 기본 생성자 변수에 val나 var키워드를 붙이면 메소드 내에서 사용이 가능하다.
 */
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