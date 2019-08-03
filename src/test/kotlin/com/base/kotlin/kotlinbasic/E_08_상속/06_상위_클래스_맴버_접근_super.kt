package com.base.kotlin.kotlinbasic.E_08_상속

open class Super1{
    open var x: Int = 10
    open fun someFun(){
        println("Supperrr")
    }

}
class Sub1:Super1(){
    override fun someFun() {
        super.someFun() // super 키워드로 상위 맴버 접근
        println("override")
    }
}