package com.base.kotlin.kotlinbasic.E_03_기초_데이터_타입

/**
 * is 키워드로 타입 확인 후 타입이 맞으면 자동 캐스팅이 이루어진다.
 */
fun checkType(obj: Any):Int?{
    //val strData: String = obj
    if(obj is String){
        return obj.length
    }
    return null
}

fun checkType2(obj: Any):Int?{
    if(obj !is String) return null
    return obj.length
}