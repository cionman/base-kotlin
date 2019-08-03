package com.base.kotlin.kotlinbasic.E_03_기초_데이터_타입

var intData2: Int = 10
// var LongData: Long = intData2 // 타입 미스매치
var LongData: Long = intData2.toLong()  //명시적으로 형변환 해야한다.

val cal :Long = 1L + 3