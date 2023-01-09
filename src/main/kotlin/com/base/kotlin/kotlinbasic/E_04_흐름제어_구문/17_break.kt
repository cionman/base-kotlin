package com.base.kotlin.kotlinbasic.E_04_흐름제어_구문

/**
 * 일반적인 Java의 continue break와 똑같다
 */
fun main(args: Array<String>) {
    for(i in 1..3){
        for(j in 1..3){
            if(j > 1) break
            println("i : $i j : $j")
        }
    }
}