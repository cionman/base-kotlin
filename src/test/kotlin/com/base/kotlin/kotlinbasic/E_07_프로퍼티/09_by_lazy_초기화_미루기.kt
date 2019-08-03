package com.base.kotlin.kotlinbasic.E_07_프로퍼티

/*
 1. 호출 시점에 초기화 진행됨
 2. val로 선언한 프로퍼티에만 사용가능
 3. 클래스 몸체 이외에 최상위 레벨에서도 사용가능
 3. 기초타입에도 사용가능
 */

val someData: String by lazy{
    println("i am someData lazy...")
    "hello"
}

class User8{
    val name: String by lazy{
        println("iam name lazy")
        "kkang"
    }
    val age: Int by lazy {
        println("i am age lazy...")
        10
    }
    init {
        println("i am init...")
    }
    constructor(){
        println("i am constructor ...")
    }
}

fun main(args: Array<String>) {
    val user = User8()
    println("name use Before...")
    println("name : ${user.name}")
    println("name : use after...")
    println("age : age before...")
    println("age : ${user.age}")
    println("age : age after")
    println("someData : $someData" )
}
