package com.base.kotlin.kotlinbasic.E_04_흐름제어_구문

fun main(args: Array<String>) {
    here@ for(i in 1..3){
        for(j in 1..3){
            if(j > 1) break@here
            println("i : $i j : $j")
        }
    }
}