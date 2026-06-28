package Kotlinfun main() {
    val emailInput = "sudip.dada@example.com"

    // Regex pattern for email validation
    val emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$".toRegex()

    if (emailRegex.matches(emailInput)) {
        println("Valid Email: $emailInput")
    } else {
        println("Invalid Email!")
    }
}
