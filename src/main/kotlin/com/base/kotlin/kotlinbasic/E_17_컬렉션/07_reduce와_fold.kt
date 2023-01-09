package com.base.kotlin.kotlinbasic.E_17_컬렉션

fun main(args: Array<String>) {
    val list = listOf(3, 4, 5, 6, 7, 8)

    //reduce와 fold의 차이는 초기값 지정 유무다.
    println("reduce test : ${list.reduce { sum, value -> 
        println("$sum..$value")
        sum + value
    }}")

    println("fold test : ${list.fold(10) { sum, value -> 
        println("$sum..$value")
        sum + value
    }}")

    //인수가 거꾸로 전달된다.
    println("reduceRight test : ${list.reduceRight { value, sum ->
        println("$sum..$value")
        sum + value
    }}")

    println("foldRight test : ${list.foldRight(10) { value, sum ->
        println("$sum..$value")
        sum + value
    }}")


}