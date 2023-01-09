package com.base.kotlin.kotlinbasic.E_08_상속

fun smartCast(data:Any):Int{
    if(data is Int)
        return data * data
    else
        return 0

}
fun main(args: Array<String>) {
    println("result : ${smartCast(10)}")
    println("result : ${smartCast(10.0)}")
}