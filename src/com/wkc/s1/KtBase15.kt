package com.wkc.s1

/**
 * @Author wkc
 * @Date 2024/1/22 17:34
 */

//TODO 15.Kotlin语言的String模版

fun main() {
    val garden="南气公园"
    val time=6
    println("今天在${garden}待了$time 小时")
    val isLogin=true
    println("Server Response Result:${if (isLogin)"登录成功" else "登录失败"}")
}