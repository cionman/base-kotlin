package com.base.kotlin.kotlinbasic.E_21_제네릭

class MathUtil<T: Number>{
    fun plus(arg1: T, arg2: T): Double{
        return arg1.toDouble() + arg2.toDouble()
    }
}

fun main() {
    val obj = MathUtil<Int>()
    obj.plus(10, 30)

    val obj2 = MathUtil<Double>()
    //val obj3 = MathUtil<String>() // 에러 발생
}