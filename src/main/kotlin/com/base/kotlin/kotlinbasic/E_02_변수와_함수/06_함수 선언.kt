package com.base.kotlin.kotlinbasic.E_02_변수와_함수

// fun 함수명(매개변수명 :타입) : 반환타입{}

/**
 * 1. Int 타입의 매개변수 2개와 Int를 반환타입을 가지는 함수
 * 2. 함수의 매개변수는 무조건 val로 적용됨
 * 3. 함수의 매개변수가 val로 적용되므로 값을 변경할 수 없음
 */
fun sum(a: Int, b: Int): Int{
    return a + b
}

/**
 * 1. 반환 타입이 없는 경우 Unit
 * 2. 생략 가능
 */
fun sum2(a: Int, b: Int): Unit{

}

/**
 * 1. 반환 없는 함수, Unit 생략
 */
fun sum3(a: Int, b: Int){

}