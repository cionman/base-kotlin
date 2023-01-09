package com.base.kotlin.kotlinbasic.E_07_프로퍼티

class User2{
    val name: String = "kkang"
        get() = field.toUpperCase()
        // set(value) { field = "Hello" + value } //val은 Set정의가 불가능

    val age:Int
        get() = 10

    /*var phone:String   //var는 초기값 생략 불가능
        get() = "0100000"*/

}