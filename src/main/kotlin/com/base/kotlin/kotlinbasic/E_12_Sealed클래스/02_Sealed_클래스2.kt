package com.base.kotlin.kotlinbasic.E_12_Sealed클래스

/**
 * sealed 클래스는 enum과 사용목적이 같다.
 * 하나의 상위클래스에서 하위 클래스들의 정의를 제한할 수 있는 방법
 */

sealed class Developer {
    abstract val name: String
    abstract fun code(language: String)
}

data class BackendDeveloper(override val name: String) : Developer() {
    override fun code(language: String) {
        println("저는 백엔드 개발자입니다. ${language}를 사용합니다.")
    }
}

data class FrontendDeveloper(override val name: String) : Developer() {
    override fun code(language: String) {
        println("저는 프론트엔드 개발자입니다. ${language}를 사용합니다.")
    }
}
object OtherDeveloper: Developer(){
    override val name: String = "익명"

    override fun code(language: String) {
        TODO("Not yet implemented")
    }

}
object DeveloperPool {
    val pool = mutableMapOf<String, Developer>()

    fun add(developer: Developer) = when(developer){ //seald 클래스의 경우 컴파일 시점에서 어떤 하위클래스들이 있는지 알고 있다.
        is BackendDeveloper, is FrontendDeveloper -> pool[developer.name] = developer
        is OtherDeveloper -> println("지원하지 않는 개발자입니다.")
    }

    fun get(name: String) = pool[name]
}

fun main() {
    val backendDeveloper = BackendDeveloper(name = "토니")
    DeveloperPool.add(backendDeveloper)

    val frontendDeveloper = FrontendDeveloper(name = "앤소니")
    DeveloperPool.add(frontendDeveloper)

    println(DeveloperPool.get("토니"))
    println(DeveloperPool.get("앤소니"))
}