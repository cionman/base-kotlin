package com.base.kotlin.kotlinbasic.E_08_상속

/*
   1. 코틀린의 모든 클래스는 Any 클래스의 서브 클래스이다.
   2. Java의 Object 클래스와는 다르다.
   3. Any클래스는 equals(), toString() 이외의 다른 맴버들은 제공하지 않는다.
 */

class Shape1{
    var x: Int = 0
    var y: Int = 0
    var name: String ="Rect"

    fun draw(){
        println("draw $name : location : $x, $y")
    }
}

fun main(args: Array<String>) {
    val obj1: Any = Shape1()
    val obj2: Any = Shape1()
    val obj3 = obj1
    println("obj1.equals(obj2) is ${obj1.equals(obj2)}")
    println("obj1.equals(obj3) is ${obj1.equals(obj3)}")
}

