package com.base.kotlin.kotlinbasic.E_07_프로퍼티

/**
 * 1. lateinit는 var로 선언한 프로퍼티에만 사용할 수 있다.
 * 2. lateinit는 클래스 몸체에 선언한 프로퍼티에만 사용할 수 있다. 주생성자에서는 사용할 수 없다.
 * 3. lateinit는 사용자 정의 getter/setter를 사용하지 않은 프로퍼티에만 사용할 수 있다.
 * 4. null 허용 프로퍼티에는 사용할 수 없다.
 * 5. 기초 타입 프로퍼티에는 사용할 수 없다.
 */
class User7
//(lateinit var data1: String) // 주 생성자에서는 사용할 수 없다.
{
    lateinit var lateData: String
    //lateinit val data2: String // lateinit는 val를 사용할 수 앖다.
    //lateinit var data3: String? // lateinit는 null 허용할 수 없다.
    //lateinit var data4: Int // lateinit는 기초타입을 사용할 수 없다.
}

fun main(args: Array<String>) {
    val user = User7()
    user.lateData = "hello"
    println(user.lateData)
}