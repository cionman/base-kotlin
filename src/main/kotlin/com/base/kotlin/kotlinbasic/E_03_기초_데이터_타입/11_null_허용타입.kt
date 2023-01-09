package com.base.kotlin.kotlinbasic.E_03_기초_데이터_타입

//null 허용타입은 타입 뒤에 ? 기호를 사용
//val a: Int = null
val b: Int? = null

fun nullable(str: String) : Int? = str.toIntOrNull()