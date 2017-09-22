package com.irshad.kotlinpractice.practice

/**
 * Created by irshadvali on 22/09/17.
 */

fun main(args: Array<String>) {


    var cityNameObje = CityName()
    cityNameObje.cityName = "Kanpur"
    cityNameObje.displayCityName(cityNameObje.cityName)
}

class CityName {
    var cityName: String = ""
    fun displayCityName(cityName: String) {
        println("the city name is "+cityName)
        println("the city name is ${ cityName }")
    }
}

