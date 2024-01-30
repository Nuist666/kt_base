package com.wkc.s2

/**
 * @Author wkc
 * @Date 2024/1/30 12:18
 */

//TODO 30.Kotlin语言的简略写法学习

fun main(){

    doLogin("wkc","114514",{responseMsg:String,responseCode:Int->
        println("服务器响应结果：responseMsg $responseMsg,responseCode $responseCode")
    })
    doLogin("wkc2","11514"){responseMsg:String,responseCode:Int->
        println("服务器响应结果：responseMsg $responseMsg,responseCode $responseCode")
    }
}


private const val DB_SAVE_USER_NAME="wkc"
private const val DB_SAVE_USER_PWD="114514"
private fun doLogin(userName:String,userPwd:String,serverResponse:(String,Int)->Unit){

    if(DB_SAVE_USER_NAME==userName && DB_SAVE_USER_PWD==userPwd){
        //业务逻辑
        val serverResponseResult="登录成功"
        serverResponse(serverResponseResult,200)
    }
    else{
        //业务逻辑
        val serverResponseResult="登录失败"
        serverResponse(serverResponseResult,404)
    }
}