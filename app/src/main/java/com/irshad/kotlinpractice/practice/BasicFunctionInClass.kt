package com.irshad.kotlinpractice.practice

/**
 * Created by irshadvali on 22/09/17.
 */
fun main(args: Array<String>){

    var myname: String
    myname = "Irshad Vali"
    var personObj = Person()
    personObj.displayname(myname)
}
class Person{
    fun displayname(name: String){
        println(name)

    }
}
