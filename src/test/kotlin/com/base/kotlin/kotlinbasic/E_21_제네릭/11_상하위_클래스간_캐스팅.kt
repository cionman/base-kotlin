package com.base.kotlin.kotlinbasic.E_21_제네릭

open class Super{
    open fun sayHello(){
        println("i am super sayHello")
    }
}

class Sub:Super(){
    override fun sayHello() {
        println("i am sub sayHello")
    }

    fun sayGoodBye(){
        println("i am sub sayGoodBye")
    }
}

fun main(args: Array<String>) {
    val obj: Super = Sub()
    obj.sayHello()

    val obj2: Sub = obj as Sub
    obj2.sayHello()

    val obj3: Super = Super()
    val obj4: Sub = obj3 as Sub
    obj4.sayGoodBye()
}