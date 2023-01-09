package com.base.kotlin.kotlinbasic.E_05_연산자

/**
 * 모든 클래스는 연산자 함수가 숨겨져있는듯하다. 그래서 재정의시 operator 키워드를 앞에 붙여주고 재정의해야한다.
 */
data class MyClass(val no:Int){
    operator fun plus(arg:Int): Int{
        return no - arg
    }

}

operator fun MyClass.minus(arg: Int): Int{
    return no + arg
}

class Test(val no:Int){
    operator fun plus(arg: Int):Int {
        return no - arg
    }
}

fun main(args: Array<String>) {
    val obj: MyClass = MyClass(10)
    val result1 = obj + 5
    val result2 = obj - 5

    println("result1: $result1.. result2: $result2")
    println("${Test(30) + 5}")
}