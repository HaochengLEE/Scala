package com.scala.stage2

object CreateDemo {
  //result用来存放最终的结果
  def createError(errorCode:Int):String={
    var result:String=_
    errorCode match {
      case 1 =>
        result = "NetWork Failure"
      case 2 =>
        result="IO Failure"
      case 3 =>
        result="OS Failure"


    }
    return result
  }

  //面向表达式改进
  def createError1(errorCode:Int):String={
    //把result的定义成了val，这样让类型推到来判断类型
    var result=errorCode match {
        case 1 => "NetWork Failure"
        case 2 => "IO Failure"
        case 3 => "OS Failure"


      }
    return result


  }

  //面向表达式的最终版
  def createError2(errorCode:Int):String=errorCode match {
    case 1 => "NetWork Failure"
    case 2 => "IO Failure"
    case 3 => "OS Failure"

  }




}
