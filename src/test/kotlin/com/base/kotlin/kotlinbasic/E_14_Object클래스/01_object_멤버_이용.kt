package com.base.kotlin.kotlinbasic.E_14_Object클래스

class Outer2{
    private var no:Int = 0

    private val myInner = object{ // object클래스를 이용하기 위해서는 private 키워드를 사용해야합니다.
        val name: String = "kkang"
        fun innerFun(){
            println("innerFun.....")
            no++
        }
    }

    fun outerFun(){
        myInner.name
        myInner.innerFun()
    }
}

fun main(args:Array<String>){
    val obj = Outer2()
    //obj.myInner.name //에러 발생, 외부에서는 사용할 수 없다.
    //obj.myInner.innerFun() //에러 발생
}