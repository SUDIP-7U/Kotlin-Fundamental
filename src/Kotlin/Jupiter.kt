package Kotlin

fun main() {
    TakingNumber()
}

fun Forloop() {
    // () this is the range operator
    for (i in 1..10 step 4) {
        println(i)
    }
}

fun NoRevenge(){
    val nums = intArrayOf(2, 7, 11, 15)
    for (i in nums.indices) {
        println(nums[i])
    }
    /*
    nums.indices হেলা array এর property যা সবসময় whole index range (০ থেক শষ পযন্ত) দয়।
     */
}

fun TakingNumber(){
    val nums = listOf(2, 7, 11, 15)
// শুধু প্রথম 2টা element িনেত চাই

    // concrete // িনিদষ্ট সংখ্যক element িনেত চাও, তখন Kotlin এ take() ব্যবহার
    val firstTwo = nums.take(2)
    println(firstTwo) // Output: [2, 7]
}


fun buffer3loopsonly(){
    for (i in 1..10 step 3) {
        for (j in 1..10 step 3) {
            for (k in 1..10 step 3) {
                print("$i ")
            }
        }
    }
}


// downTo
//until
// if condition
// find even odd num % 2
// explore more....