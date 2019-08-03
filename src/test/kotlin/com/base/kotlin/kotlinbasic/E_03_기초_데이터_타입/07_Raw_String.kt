package com.base.kotlin.kotlinbasic.E_03_기초_데이터_타입

/**
 * escaped string
 */
var escapedString :String = "Hello \n World"

/**
 * raw 문자열
 */
var rawString :String = """Hello
World"""

fun main(args: Array<String>) {
    println(escapedString)
    println(rawString)
}
