package com.base.kotlin.kotlinbasic.E_03_기초_데이터_타입

fun main(args: Array<String>) {
    /**
     * list iterator
     */
    val list1 = listOf<String>("hello", "list")
    val iterator1 = list1.iterator()
    while (iterator1.hasNext()){
        println(iterator1.next())
    }

    /**
     * map iterator
     */
    val map = mapOf<String, String>("one" to "hello", "two" to "map")
    val iterator2 = map.iterator()
    while(iterator2.hasNext()){
        val entry = iterator2.next()
        println("${entry.key} .. ${entry.value}")
    }

    /**
     * set iterator
     */
    val set = setOf<String>("hello", "set")
    val iterator3 = set.iterator()
    while(iterator3.hasNext()){
        println("${iterator3.next()}")
    }
}