package Kotlinfun main() {
    // Variable declare
    val number = 3

    // When expression ব্যবহার
    val result = when (number) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4, 5 -> "Four or Five"   // multiple match
        in 6..10 -> "Between Six and Ten" // range check
        else -> "Unknown number"
    }

    println("Number is: $result")
}
