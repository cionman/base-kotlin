package com.base.kotlin.kotlinbasic.E_19_예외처리

import java.lang.ClassCastException
import java.lang.Exception

fun some(array:Array<Any>){
    try{
        println("Try top...")
        val intData: Int = array[0] as Int
        val data: String = array[2] as String
        val data2: Int = data.toInt()
    }catch (e: ClassCastException){
        println("catch ... ClassCastException")
    }catch (e: ArrayIndexOutOfBoundsException){
        println("catch ... ArrayIndexOutOfBoundsException")
    }catch (e: Exception){
        println("catch ... Exception")
    }finally {
        println("finally")
    }
}

fun main(args: Array<String>) {
    //캐스팅 예외
    some(arrayOf("0", 1, "6"))
    //배열 접근 예외
    some(arrayOf(10, "5"))
    //숫자타입 예외
    some(arrayOf(10, 0, "world"))
}