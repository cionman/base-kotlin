package com.base.kotlin.kotlinbasic.E_18_Null안전성


fun main(args: Array<String>) {
    var data: String? = "kkang"
    var length: Int = if(data != null){
        data.length
    }else{
        -1
    }

    data = null
    length = data?.length ?: -1 // ?: null이면 실행 엘비스 연산자

    println(length)

    data ?: println("data is null")
}