package indexarraylistof

fun main() {
    // ArrayList তৈরি করা
    val fruits = arrayListOf("Apple", "Banana", "Mango", "Orange")

    // index দিয়ে access করা
    println("First fruit: ${fruits[0]}")
    println("Second fruit: ${fruits[1]}")

    // loop দিয়ে সব element দেখানো
    for (index in fruits.indices) {
        println("Index $index -> ${fruits[index]}")
    }

    // নতুন item যোগ করা
    fruits.add("Pineapple")
    println("After adding: $fruits")

    // নির্দিষ্ট index এ update করা
    fruits[2] = "Strawberry"
    println("After update: $fruits")

    // নির্দিষ্ট index থেকে remove করা
    fruits.removeAt(1)
    println("After remove: $fruits")
}
