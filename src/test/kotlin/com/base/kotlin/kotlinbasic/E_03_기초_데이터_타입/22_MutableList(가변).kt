package com.base.kotlin.kotlinbasic.E_03_기초_데이터_타입

fun main(args: Array<String>) {
    val mutableList:MutableList<String> = mutableListOf("hello", "world")
    mutableList.add("kkang")
    mutableList.set(1, "korea")
    println("${mutableList.get(0)}..${mutableList.get(1)}..${mutableList.get(2)}")
}