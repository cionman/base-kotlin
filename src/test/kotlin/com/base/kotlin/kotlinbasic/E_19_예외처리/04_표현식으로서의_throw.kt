package com.base.kotlin.kotlinbasic.E_19_예외처리

import java.lang.ClassCastException
import java.lang.Exception

fun some3(){
    val name: String? = null
    val s:String = name ?: throw IllegalArgumentException("Name required")
    println("some1 bottom")
}

fun some4(arg: Int):Nothing{
    if(arg > 0){
        throw Exception("some exception .. arg > 0 true")
    }else{
        throw Exception("some exception .. arg > 0 false")
    }
}
