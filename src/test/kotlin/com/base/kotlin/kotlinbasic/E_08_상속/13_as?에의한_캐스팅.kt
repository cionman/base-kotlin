package com.base.kotlin.kotlinbasic.E_08_상속

fun main(args: Array<String>) {
    val obj7:SuperCast? = null
    val obj8:SubCast? = obj7 as? SubCast  //as?로 null이 할당된다 에러가 발생하지 않는다.

}