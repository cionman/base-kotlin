package com.base.kotlin.kotlinbasic.E_03_기초_데이터_타입

import java.util.*

fun main(args: Array<String>) {
    val arrayList: ArrayList<String> = ArrayList()
    arrayList.add("hello")
    arrayList.add("kkang")
    arrayList.set(1, "world")
    println("${arrayList.get(0)}..${arrayList.get(1)}")
}