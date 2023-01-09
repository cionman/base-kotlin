package com.base.kotlin.kotlinbasic.E_14_Object클래스

class Outer5{
    object NestedClass{
        var no: Int = 0
        fun myFun(){
            println("NestedClass 사용 ${no}")
        }
    }
}

fun main(args:Array<String>){
    val obj = Outer5()
    //obj.NestedClass.no //에러 발생
    Outer5.NestedClass.no = 10 // 자바로 변형될때 static 예약어가 추가되기 때문이다.
    Outer5.NestedClass.myFun()
}