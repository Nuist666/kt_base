package com.wkc.s2

/**
 * @Author wkc
 * @Date 2024/1/23 14:49
 */

//TODO 23.Kotlin语言的匿名函数学习
fun main() {
    val len="Nuist".count()
    println(len)
    val len2="Nuuist".count {
        it=='u'
    }
    println(len2)
}