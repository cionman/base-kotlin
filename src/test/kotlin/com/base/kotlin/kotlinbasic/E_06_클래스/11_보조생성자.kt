package com.base.kotlin.kotlinbasic.E_06_클래스

class UserTest1{} //매개변수 없는 주 생성자는 자동 추가

class UserTest2(name: String){} // 주 생성자만 선언
class UserTest3{  //보조 생성자만 선언
    constructor(name: String){}
}

fun main(args: Array<String>) {
    val user1 = UserTest1()
    val user2 = UserTest2("kkang")
    // val user3 = UserTest3() //에러
    val user4 = User3("kkang")
}