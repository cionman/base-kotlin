package com.base.kotlin.kotlinbasic.E_08_상속

open class Super5{
    init {
        println("Super init")
    }
    constructor(name: String, no: Int){
        println("Super .. constructor($name, $no)")
    }
}

class Sub5(name: String):Super5(name, 10){
    constructor(name:String, no:Int):this(name){
        println("Sub ... constructor($name, $no) call")
    }
    init {
        println("Sub ... init call ..")
    }
}

fun main(args: Array<String>) {
    Sub5("kkang")
    println("...............")
    Sub5("kkang", 10)
}