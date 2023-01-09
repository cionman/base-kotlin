package com.base.kotlin.kotlinbasic.E_16_고차함수

class User3(){
    var name: String? = null
    var age: Int? = null

    constructor(name: String, age:Int):this(){
        this.name = name
        this.age = age
    }
}
fun letTestFun(user: User3){
    println("letTestFun () : ${user.name} .. ${user.age}")
}

fun main(args: Array<String>) {
    User3("kim", 28).let { usr -> letTestFun(usr) }
    User3("Cho", 23).let { letTestFun(it) }
}




