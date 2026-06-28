package Kotlinfun main() {
    var input: String?

    while (true) {
        println("Enter your text (or type 'exit' to quit):")
        input = readLine()

        if (input == null || input.lowercase() == "exit") {
            println("Program ended.")
            break
        }

        // Regex দিয়ে অতিরিক্ত স্পেস মুছে ফেলা
        val cleaned = input.replace("\\s+".toRegex(), " ").trim()
        println("Cleaned Text: $cleaned")
    }
}
