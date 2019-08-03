package com.base.kotlin.kotlinbasic.E_08_상속

open class SuperVisible{
    val publicData: Int = 10
    protected val protectedData: Int = 10
    private val privateData: Int = 10
}

class SubVisible:SuperVisible(){
    fun visibilityTest(){
        println("$publicData ..")
        println("$protectedData ..")
        //println("$privateData ..") // 에러발생
    }
}

class someClass{
    fun visibilityTest(){
        val obj = SuperVisible()
        println("${obj.publicData} ..")
        //println("${obj.protectedData} ..") // 에러발생
        //println("${obj.privateData} ..") // 에러발생
    }
}