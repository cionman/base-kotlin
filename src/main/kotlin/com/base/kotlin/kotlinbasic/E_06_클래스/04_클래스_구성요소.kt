package com.base.kotlin.kotlinbasic.E_06_클래스

class MyClassComponent(name:String, age:Int){ // 주생성자
    val property = 10 //프로퍼티,

    init { //주생성자 추가작업이 필요할때 초기화 블럭

    }
    constructor(name:String, age:Int, gender:String):this(name, age){ //보조생성자

    }
    fun method(){} //메소드

    class Inner(){ //내부 클래스

    }
}