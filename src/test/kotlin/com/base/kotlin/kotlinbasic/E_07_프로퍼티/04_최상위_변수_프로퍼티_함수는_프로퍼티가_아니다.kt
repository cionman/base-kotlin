package com.base.kotlin.kotlinbasic.E_07_프로퍼티

var myVal: String = "hello"
    get() = field.toUpperCase()
    set(value) {
        field = "hello" + value
    }

class User3(val name: String){
    fun myFun(){
        var no = 0
            //get() = field * 10 // 지역 변수는 프로퍼티가 아니다.
    }
}
