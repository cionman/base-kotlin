package com.base.kotlin.kotlinbasic.E_20_클래스확장

open class Super3

class Sub3: Super3()

fun Super3.sayHello(){
    println("Super..sayHello")
}

fun Sub3.sayHello(){
    println("Sub .. sayHello")
}

fun some(obj: Super3){ //확장함수는 매개변수 타입에 따라 Super3의 함수가 호출 된다.
    obj.sayHello()
}

fun main(args: Array<String>) {
    some(Sub3())
}