package com.base.kotlin.kotlinbasic.E_08_상속

/*
   1. override_된_메소드는_자동_open
   2. final 키워드를 사용하면 open을 막을 수 있다.
 */

open class Rect3:Shape2(){
    final override fun print() { //

    }
}