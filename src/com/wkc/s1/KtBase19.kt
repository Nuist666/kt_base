package com.wkc.s1

import java.sql.Struct

/**
 * @Author wkc
 * @Date 2024/1/23 12:37
 */

//TODO 19.Kotlin语言的Unit函数特点
private fun action1(info:String):Unit{
    return println(info)
}
private fun action2(info:String){
    return println(info)
}
private fun action3(info: String){
    println(info)
}
fun main() {
    action1("test1")
    action2("test2")
    action3("test3")
    println(action1("test4"))
    println(action2("test5"))
    println(action3("test6"))

}