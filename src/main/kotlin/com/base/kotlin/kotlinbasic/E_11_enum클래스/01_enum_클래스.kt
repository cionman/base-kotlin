package com.base.kotlin.kotlinbasic.E_11_enum클래스

enum class Direction{
    NORTH, SOUTH, WEST, EAST
}

fun main(args: Array<String>) {
    val direction: Direction = Direction.NORTH

    println("${direction.name}...${direction.ordinal}")

    val directions: Array<Direction> = Direction.values()
    directions.forEach { t -> println(t.name) }

    val direction1 = Direction.valueOf("WEST")
    println("${direction1.name}...${direction1.ordinal}")
}