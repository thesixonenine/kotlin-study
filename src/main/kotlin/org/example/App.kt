package org.example

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    val yesterday = "December"
    println(yesterday)
    var tomorrow = "December"
    println(tomorrow)
    tomorrow = "june"
    println(tomorrow)
    println(App().greeting)
}
