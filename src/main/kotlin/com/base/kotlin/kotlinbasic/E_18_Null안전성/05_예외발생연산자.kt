package com.base.kotlin.kotlinbasic.E_18_Null안전성


fun main(args: Array<String>) {
    var data: String? = "kkang"
    data!!.length

    data =null
    //data!!.length
}