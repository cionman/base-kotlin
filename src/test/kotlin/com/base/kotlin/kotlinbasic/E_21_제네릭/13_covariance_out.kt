package com.base.kotlin.kotlinbasic.E_21_제네릭

open class Super3{
    open fun sayHello(){
        println("i am super sayHello")
    }
}

class Sub3:Super3(){
    override fun sayHello() {
        println("i am sub sayHello")
    }

    fun sayGoodBye(){
        println("i am sub sayGoodBye")
    }
}

class MyClass13<out T>

fun main(args: Array<String>) {
    val obj = MyClass13<Sub3>()
    // 하위 타입을 상위 타입으로 사용가능해짐, 반대는 불가능
    val obj2: MyClass13<Super3> = obj

    val obj3 = MyClass13<Super3>()
    // val obj4: MyClass13<Sub3> = obj3 //에러, 불가능
}