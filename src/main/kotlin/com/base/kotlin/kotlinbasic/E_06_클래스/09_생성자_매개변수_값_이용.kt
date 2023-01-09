package com.base.kotlin.kotlinbasic.E_06_클래스

/**
 * 무조건 생성자 파라미터에는 val나 var를 사용하자
 */
class User5(name:String, age:Int){
    init {
        println("i am init... construnctor arg: $name .. $age")
    }

    val upperName = name.toUpperCase()

    fun sayHello(){
        // println("hello $name") //생성자에 var나 val를 명시 하지 않을 경우 함수에서는 사용할 수 없다. 생성자에는 var나 val를 무조건 사용하는 것이 좋지 않을까 함..
    }
}