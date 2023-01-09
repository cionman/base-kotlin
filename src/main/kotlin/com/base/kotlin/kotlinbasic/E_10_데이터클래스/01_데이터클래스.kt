package com.base.kotlin.kotlinbasic.E_10_데이터클래스

/*
  내부에 특별한 로직의 함수 없이 데이터만 포함할 수 있는 클래스
  자바에서는 보통 VO클래스라 부르는 형태,

 */

/**
 *  1. 주생성자 선언이 필수, 주 생성자의 매개변수는 최소 하나 이상
 *  2. 모든 주 생성자의 매개변수는 var 혹은 val로 선언해야한다.
 *  3. 데이터 클래스는 abstract, open, sealed, inner 등의 예약어를 추가할 수 없다.
 */
data class User(val name: String, val age: Int)


// data class User1() // 생성자의 매개변수가 없다.
// data class User2(name: String) // val 또는 var로 선언되야 한다.
//data abstract class User3(val name: String) //  클래스 앞에 추가 키워드 쓸수 없다.