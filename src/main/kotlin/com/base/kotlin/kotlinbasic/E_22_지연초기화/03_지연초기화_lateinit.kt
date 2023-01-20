package com.base.kotlin.kotlinbasic.E_22_지연초기화

import javax.security.auth.Subject

/*
    by lazy에는 불변인 val로 적용해야만하지만, lateinit은 가변 속성을 써야할때 사용할 수 있다.
 */

class LateExample {

    /*@Autowired
    lateinit var service: TestService*/ //

    lateinit var subject: Subject

    //     @Setup // junit 으로 뒤늦게 가변적으로 초기화할때 lateinit을 사용
    fun setup() {
        subject = Subject()
    }
}