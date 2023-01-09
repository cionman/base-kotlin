package com.base.kotlin.kotlinbasic.E_21_제네릭

fun some19(arg: List<*>){

    // if(arg is List<Int>){ }  //에러 발생, 제네릭 정보가 컴파일때 제거되므로 <*> 타입이<Int>타입인지 점검할 수 없어서 에러 발생

}