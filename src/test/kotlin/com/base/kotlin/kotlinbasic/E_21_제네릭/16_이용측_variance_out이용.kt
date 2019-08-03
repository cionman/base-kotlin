package com.base.kotlin.kotlinbasic.E_21_제네릭

class MyClass16<T>(val data: T){
    fun myFun():T {
        return data
    }

    fun myFun2(arg: T){

    }

    fun myFun3(arg:T): T{
        return data;
    }
}

fun some2(arg: MyClass16<out Number>){
    arg.myFun()
    //arg.myFun2(10) //에러
    //arg.myFun3(10) //에러
}