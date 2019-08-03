package com.base.kotlin.kotlinbasic.E_21_제네릭
/*
스타 프로젝션이란 제네렉 타입을 <*> 표현하는 것을 의미합니다. 스타 프로젝션은 제네렉 타입을 모른다는 의미입니다.
*/
//class MyClass17<*> //에러 스타프로젝션은 이용측에서만 사용 가능

class MyClass17<T>

fun myFun(arg: MyClass17<*>){
}