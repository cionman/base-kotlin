package com.base.kotlin.kotlinbasic.E_08_상속

open class Super2(name:String)

class Sub2(name:String):Super2(name) //상위 클래스 생성자를 연결 해주어야 한다.

class Sub3(name:String):Super2("kkang")