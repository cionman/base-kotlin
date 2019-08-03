package com.base.kotlin.kotlinbasic.E_21_제네릭

fun some20(arg: List<*>){
    val intList = arg as List<Int>
    println(intList.sum())

}
fun main(args: Array<String>) {
    some20(listOf(10, 20))
    some20(listOf("kkang", "ttt")) //ClasscastException
}