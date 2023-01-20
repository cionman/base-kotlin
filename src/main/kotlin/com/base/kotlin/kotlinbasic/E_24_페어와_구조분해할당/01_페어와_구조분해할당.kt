package com.base.kotlin.kotlinbasic.E_24_페어와_구조분해할당
;

// data class Tuple(val a: Int, val b: Int)
fun plus(pair: Pair<Int, Int>) = pair.first + pair.second

fun main() {
    val plus = plus(Pair(1, 3))
    println(plus)

    val pair = Pair("A", 2)
    //    pair.first = "B" // 불변이라 재할당은 컴파일 오류 발생

    val newPair = pair.copy(first = "B")
    println("newPair : ${newPair}")

    val second = newPair.component2()
    println("second : ${second}")

    val list = newPair.toList()
    println("list : ${list}")


    val triple = Triple("A", "B", "C")

    println("triple : ${triple}")
    println("triple first : ${triple.first}")
    println("triple second : ${triple.second}")
    println("triple third : ${triple.third}")
    println("triple component3 : ${triple.component3()}")

    val newTriple = triple.copy(third = "D")

    // 구조분해할당
    val (a, b, c) = newTriple
    val (d: String, e: String, f: String) = newTriple

    println("$a, $b, $c")
    println("$d, $e, $f")

    val tripleList = newTriple.toList()
    val (a1, a2, a3) = tripleList
    println("$a1, $a2, $a3")

    tripleList.component1()
    tripleList.component2()
    tripleList.component3()
    tripleList.component4()
    tripleList.component5() // 5까지 제공

    val map = mutableMapOf("최수원" to "개발자") //  mutableMapOf(Pair("최수원","개발자")) // Pair로 치환가능
    for ((key, value) in map) {
        println("${key}의 직업은 $value")
    }
}

