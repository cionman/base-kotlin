package com.base.kotlin.kotlinbasic.E_06_클래스

/*
 1. 클래스 선언부에 작성
 2. 하나의 클래스에 하나의 주 생성자
 3. 반드시 작성해야하는 것은 아님, 보조생성자가 있으면 작성 안해도 됨
 */

class MyTest1{}

class MyTest2(){}

class MyTest3 constructor(){

}

fun main(args: Array<String>) {
    val obj1 = MyTest1()
    val obj2 = MyTest2()
    val obj3 = MyTest3()
}