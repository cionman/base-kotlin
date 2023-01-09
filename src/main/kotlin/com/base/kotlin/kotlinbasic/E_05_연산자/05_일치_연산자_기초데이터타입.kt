package com.base.kotlin.kotlinbasic.E_05_연산자

/**
 * 기초 데이터 타입은 값이 같으면 객체도 같다.
 * null 허용인경우는 128을 기준으로 객체가 달라진다.
 * 코틀린 코드가 자바코드로 변경될 때 Integer,valueOf()로 변경 되는데, 이함수는 -128~127 까지는 값이 같으면 새로 객체를 생성하지 않고 같은 객체를 반환하기 때문이다.
 */
fun main(args: Array<String>) {
    val data1: Int = 10
    val data2: Int = 10
    println("data1 == data2 is ${data1 == data2}")
    println("data1 === data2 is ${data1 === data2}")

    val data3: Int? = 127
    val data4: Int? = 127
    println("data3 == data4 is ${data3 == data4}")
    println("data3 === data4 is ${data3 === data4}")

    val data5: Int? = 128
    val data6: Int? = 128
    println("data5 == data6 is ${data5 == data6}")
    println("data5 === data6 is ${data5 === data6}")

    val data7: Double? = 10.0
    val data8: Double? = 10.0
    println("data7 == data8 is ${data7 == data8}")
    println("data7 === data8 is ${data7 === data8}")

}

