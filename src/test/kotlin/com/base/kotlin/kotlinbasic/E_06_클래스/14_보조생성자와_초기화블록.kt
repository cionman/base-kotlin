package com.base.kotlin.kotlinbasic.E_06_클래스

class CustomUser{
    init{
        println("init") // 가장 먼저 실행
    }
    constructor(){
        println("constructor") //초기화 블록 이후 실행
    }
}

fun main(args: Array<String>) {
    val user = CustomUser()
}