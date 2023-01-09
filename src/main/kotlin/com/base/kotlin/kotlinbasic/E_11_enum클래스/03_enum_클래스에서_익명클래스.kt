package com.base.kotlin.kotlinbasic.E_11_enum클래스

enum class Direction2{

    NORTH {
        override val id: Int = 1

        override fun printId() {
            println("id : $id")
        }
    },
    SOUTH{
        override val id: Int = 2
        override fun printId() {
            println("id : $id")
        }
    },
    WEST {
        override val id: Int = 3
        override fun printId() {
            println("id : $id")
        }
    },
    EAST{
        override val id: Int = 4
        override fun printId() {
            println("id : $id")
        }
    };

    abstract val id:Int
    abstract fun printId()
}

fun main(args: Array<String>) {
    val direction:Direction2 = Direction2.NORTH
    println(direction.id)
    direction.printId()
}