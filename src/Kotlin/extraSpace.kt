package Kotlin

fun main() {
    val text = "Sudip    dada   regex   input"
    val cleaned = text.replace("\\s+".toRegex(), " ").trim()
    println(cleaned) // Output: "Sudip dada regex input"
}
