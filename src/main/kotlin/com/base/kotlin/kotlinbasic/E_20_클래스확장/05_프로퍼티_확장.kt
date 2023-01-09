package com.base.kotlin.kotlinbasic.E_20_클래스확장

//함수확장과 마찬가지로 프로퍼티 확장도 할 수 있음. 단 get() 함수로만 추기화됨

class Property{
    val classData: Int = 0
}

// val Property.extensionData1: Int = 10 //에러 발생
val Property.extensionData2: Int
    get() = 10

fun main(args: Array<String>) {
    val obj = Property()
    println("classData ${obj.classData}... extensionData : ${obj.extensionData2}")
}
