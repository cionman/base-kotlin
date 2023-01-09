package com.base.kotlin.kotlinbasic.E_21_제네릭

interface MyInterface1
interface MyInterface2

class MyHandler1: MyInterface1, MyInterface2
class MyHandler2: MyInterface1
//여러개 제약은 where예약어를 사용함
class MyClass9<T> where T: MyInterface1, T:MyInterface2{
}

fun main(args: Array<String>) {
    val obj = MyClass9<MyHandler1>()
    //val obj2 = MyClass9<MyHandler2>() // 에러 발생
}