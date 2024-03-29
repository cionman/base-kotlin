package com.base.kotlin.kotlinbasic.E_21_제네릭

/*
   제네릭이란 형식 타입입니다. 자바나 코틀린 같은 대부분 프로그래밍 언어는 변수 타입을 명확하게 선언해야합니다.
   String, Int등의 타입을 명시해야하는데 때로는 클래스, 함수, 변수 등을 선언할 때 타입을 예측할 수 없거나 하나의 타입으로 고정할 수 없는 경우가 있습니다.
   그렇다고 타입을 선언하지 않을 수는 없습니다. 이 때 사용하는 것이 제네릭입니다.
 */

//타입을 명시해 배열 이용
val array2: Array<Int> = arrayOf<Int>(10, 20)
