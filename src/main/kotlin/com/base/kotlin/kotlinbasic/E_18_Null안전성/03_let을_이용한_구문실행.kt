package com.base.kotlin.kotlinbasic.E_18_Null안전성


fun main(args: Array<String>) {
    val array = arrayOf("hello", null, "kkang")

    array.forEach {
        if(it != null){
            println("$it .. ${it.length}")
        }
    }

    array.forEach {
        it?.let{
            println("$it .. ${it.length}")
        }
    }
}