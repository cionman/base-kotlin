package com.base.kotlin.kotlinbasic.E_06_클래스

// 보조 생성자의 매개변수는 클래스 내에서 사용 불가능

class User7{
    init{
        //println("i am init block .... $name") // 에러
    }

    constructor(name: String){
        println("constructor $name")
    }
    fun sayHello(){
        //println("hello $name") //에러
    }
}
