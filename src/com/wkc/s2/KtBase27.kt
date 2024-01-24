package com.wkc.s2

/**
 * @Author wkc
 * @Date 2024/1/24 13:24
 */

//TODO 27.Kotlin语言的匿名函数的类型推断

fun main() {

    val method1={
        v1:Double,v2:Float,v3:Int->
        "v1:$v1,v2:$v2,v3:$v3"
    }
    val method2={
        11.1f
    }
    val method3={
        num:Int->
        num
    }
    println(method1(114.514,114.5f,114))
    println(method2())
    println(method3(25))
}