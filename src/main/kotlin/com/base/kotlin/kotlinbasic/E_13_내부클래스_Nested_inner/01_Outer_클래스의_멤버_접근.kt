package com.base.kotlin.kotlinbasic.E_13_내부클래스_Nested_inner

class Outer{
    var no: Int = 10
    fun outerFun(){
        println("outerFun() ... ")
    }
    class Nested1{
        val name: String = "kkang"
        fun myFun(){
            println("myFun()...")
            // no = 20 // 내부클래스지만 inner 키워드를 쓰지 않으면 outer 에 접근할 수 없다.
        }
    }

    inner class Nested2{
        val name: String = "kkang"
        fun myFun(){
            println("myFun()...")
            no = 20 // inner 키워드를 사용하여 내부에 접근할 수 있다.
        }
    }

    fun creatNested2(): Nested2{
        return Nested2()
    }
}

fun main(args: Array<String>) {
    val obj1: Outer.Nested1 = Outer.Nested1()
    // val obj2: Outer.Nested2 = Outer.Nested2() inner 클래스의경우 바로 선언할 수 없다.
    val obj2:Outer.Nested2 = Outer().Nested2()
    val obj3:Outer.Nested2 = Outer().creatNested2()
}