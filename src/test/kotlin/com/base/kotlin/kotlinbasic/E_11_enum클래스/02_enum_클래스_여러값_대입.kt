package com.base.kotlin.kotlinbasic.E_11_enum클래스

enum class Direction1(val no:Int, val msg:String){
    NORTH(1,"북쪽"), SOUTH(2, "남쪽"), WEST(3, "서쪽"), EAST(4,"동쪽")
}

fun main(args: Array<String>) {
    val direction: Direction1 = Direction1.NORTH

    println("${direction.name}...${direction.ordinal}..${direction.no}..${direction.msg}")

    val directions: Array<Direction1> = Direction1.values()
    directions.forEach { t -> println("${t.name} : ${t.no}..${t.msg}") }

    val direction1 = Direction1.valueOf("WEST")
    println("${direction1.name}...${direction1.ordinal}..${direction.no}..${direction.msg}")
}