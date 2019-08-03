package com.base.kotlin.kotlinbasic.E_14_Object클래스

class Outer6{
    companion object NestedClass{
        var no: Int = 0
        fun myFun(){
            println("NestedClass 사용 ${no}")
        }
    }
}

fun main(args:Array<String>){

    Outer6.NestedClass.no = 10
    Outer6.NestedClass.myFun()

    Outer6.no  = 15 // companion 키워드는 object클래스의 명칭을 사용하지 않고 바로 이용하게 해줍니다.
    Outer6.myFun() //
}