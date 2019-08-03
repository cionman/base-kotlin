package com.base.kotlin.kotlinbasic.E_18_Null안전성


fun main(args: Array<String>) {
    val strData: String = "kkang"
    val intData: Int? = strData as? Int // 형변환을 할 수 없을 경우 null 반환
}