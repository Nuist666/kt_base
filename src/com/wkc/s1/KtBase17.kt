package com.wkc.s1

/**
 * @Author wkc
 * @Date 2024/1/23 12:13
 */

//TODO 17.Kotlin中函数参数的默认参数

fun main() {
    action1("wkc",22)
    action2("nuist")
    action3()
    action3("WKC",21)
}
private fun action1(name:String,age:Int){
    println("姓名:${name},年龄:${age}")
}
private fun action2(name:String,age:Int=20){
    println("姓名:${name},年龄:${age}")
}
private fun action3(name:String="NUIST",age:Int=23){
    println("姓名:${name},年龄:${age}")
}
