package Kotlin

fun main() {
val ms = Person(name = "Mike", age = 25)
    println(ms.name)
}

class Person(val name: String) {
    var age: Int = 0
    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }
}