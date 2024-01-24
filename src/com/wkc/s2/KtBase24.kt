package com.wkc.s2

/**
 * @Author wkc
 * @Date 2024/1/23 14:56
 */

//TODO 24.Kotlin语言的函数类型&隐式返回学习

fun main() {
    val methodAction:()->String
    methodAction={
        val inputValue=114514
        "Nuist $inputValue"
    }
    println(methodAction())
}