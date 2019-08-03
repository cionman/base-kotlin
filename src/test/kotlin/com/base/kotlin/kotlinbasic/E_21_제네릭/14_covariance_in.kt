package com.base.kotlin.kotlinbasic.E_21_제네릭

open class Super4{
    open fun sayHello(){
        println("i am super sayHello")
    }
}

class Sub4:Super4(){
    override fun sayHello() {
        println("i am sub sayHello")
    }

    fun sayGoodBye(){
        println("i am sub sayGoodBye")
    }
}

class MyClass14<in T>

fun main(args: Array<String>) {
    val obj = MyClass14<Sub4>()
    // val obj2: MyClass14<Super4> = obj // 반대의 타입은 불가능

    val obj3 = MyClass14<Super4>()
    // 상위 타입을 하위 타입으로 사용가능해짐, 반대는 불가능
    val obj4: MyClass14<Sub4> = obj3
}