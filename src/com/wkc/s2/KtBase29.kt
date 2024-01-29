package com.wkc.s2

import javax.print.attribute.standard.RequestingUserName

/**
 * @Author wkc
 * @Date 2024/1/29 13:30
 */

//TODO 29.在函数中定义参数是函数的函数
fun main(){
    val response={responseMsg:String,responseCode:Int->
        println("服务器响应结果：responseMsg $responseMsg,responseCode $responseCode")
    }
    doLogin("wkc","114514",response)
}

const val DB_SAVE_USER_NAME="wkc"
const val DB_SAVE_USER_PWD="114514"

private fun doLogin(userName:String,userPwd:String,serverResponse:(String,Int)->Unit){
    if(DB_SAVE_USER_NAME==userName && DB_SAVE_USER_PWD==userPwd){
        //业务逻辑
        val serverResponseResult="登录成功！"
        serverResponse(serverResponseResult,200)
    }else
    {
        //业务逻辑
        val serverResponseResult="登录失败！"
        serverResponse(serverResponseResult,404)
    }
}