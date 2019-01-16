package com.scala.stage4

object ConstructorApp {
  def main(args: Array[String]): Unit = {
    val person=new Person("Lee",30)
    println(person.name+person.age+person.school)

    val person2=new Person("zhang",18,"M")
    println(person2.name+person2.age+person2.school+person2.gender)
  }


}

//主构造器
class Person(val name:String,val age:Int){
  println("Person...")

  val school = "NIT"
  var gender = ""

  //附属构造器
  def this(name:String,age:Int,gender:String){
    this(name,age) //附属构造器的第一行代码必须要调用主构造器或者其他附属构造器
    this.gender=gender
  }

  println("Person leave...")

}
