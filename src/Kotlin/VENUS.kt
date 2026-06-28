package Kotlin

fun step() {
    for (i in 1..10) {
        println(i)
    }
}

fun fiveStep() {
    for (i in 1..20 step 5) {
        println(i)
    }
}

fun doewnto() {
    for (i in 10 downTo 1) {
        println(i)
    }
}

fun main() {
    fiveStep()
}