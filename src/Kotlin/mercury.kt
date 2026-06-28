package Kotlin


fun main() {
    val name = readLine()!!
    var thouughts = name
    println("Hello World $name")
    println(thouughts)
    println("MY CURRENT THOUGHT IS $thouughts")
    val ms = PrefrontalCortex()
    println(ms)
    val ns = futureThoughts()
    println(ns)

}


fun PrefrontalCortex(){
    println("Cortex")
}


fun futureThoughts() {
    println("thoughts")
}