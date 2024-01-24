package com.wkc.s2

/**
 * @Author wkc
 * @Date 2024/1/23 15:09
 */

//TODO 25.Kotlin语言的函数参数学习

fun main() {
    val methodAction:(Int,Int,Int)->String={number1,number2,number3->
        val inputValue=114514
        "$inputValue Nuist 参数1: $number1 参数2: $number2 参数3: $number3"
    }
    println(methodAction(1, 2, 3))
}