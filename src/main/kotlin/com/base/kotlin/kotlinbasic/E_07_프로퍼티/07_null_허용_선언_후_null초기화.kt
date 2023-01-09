package com.base.kotlin.kotlinbasic.E_07_프로퍼티

class User5{
    val name1: String = "kkang"
    var name2: String? = null
    val name3: String? = null
    var age: Int? = null

    constructor(name2: String, name3: String, age:Int){
        this.name2 = name2
        //this.name3 = name3 // val로 선언했기때문에 재할당시 에러
        this.age = age
    }
}