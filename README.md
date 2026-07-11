# Kotlin `for` Loop — Summary

A quick reference guide to the `for` loop in Kotlin: syntax, common patterns, and examples.

## 📌 Basic Syntax

```kotlin
for (item in collection) {
    // do something with item
}
```

Kotlin's `for` loop iterates over anything that provides an **iterator** — ranges, arrays, lists, maps, strings, etc.

## 🔢 Looping Over a Range

```kotlin
for (i in 1..5) {
    println(i) // 1, 2, 3, 4, 5
}
```

| Syntax | Meaning |
|---|---|
| `1..5` | Inclusive range: 1 to 5 |
| `1 until 5` | Exclusive range: 1 to 4 |
| `5 downTo 1` | Counts backwards: 5, 4, 3, 2, 1 |
| `1..10 step 2` | Skips by 2: 1, 3, 5, 7, 9 |

```kotlin
for (i in 1 until 5) { println(i) }      // 1,2,3,4
for (i in 5 downTo 1) { println(i) }     // 5,4,3,2,1
for (i in 1..10 step 2) { println(i) }   // 1,3,5,7,9
```

## 📋 Looping Over Arrays / Lists

```kotlin
val fruits = listOf("Apple", "Banana", "Cherry")

for (fruit in fruits) {
    println(fruit)
}
```

### With Index

```kotlin
for ((index, fruit) in fruits.withIndex()) {
    println("$index: $fruit")
}
```

### Using Indices Directly

```kotlin
for (i in fruits.indices) {
    println(fruits[i])
}
```

## 🗺️ Looping Over a Map

```kotlin
val map = mapOf("a" to 1, "b" to 2, "c" to 3)

for ((key, value) in map) {
    println("$key -> $value")
}
```

## 🔤 Looping Over a String

```kotlin
for (char in "Kotlin") {
    println(char)
}
```

## 🔁 Nested Loops & Labels

```kotlin
outer@ for (i in 1..3) {
    for (j in 1..3) {
        if (j == 2) continue@outer
        println("i=$i, j=$j")
    }
}
```

- `break@label` exits the labeled loop entirely
- `continue@label` skips to the next iteration of the labeled loop

## ⚡ Quick Comparison Table

| Use Case | Example |
|---|---|
| Simple range | `for (i in 1..10)` |
| Exclusive end | `for (i in 0 until size)` |
| Reverse | `for (i in 10 downTo 1)` |
| Step | `for (i in 0..20 step 5)` |
| Collection | `for (item in list)` |
| Index + value | `for ((i, v) in list.withIndex())` |
| Map entries | `for ((k, v) in map)` |

## ✅ Key Notes

- Kotlin does **not** have a traditional C-style `for (int i = 0; i < n; i++)` loop — ranges replace it.
- `for` works with anything implementing `Iterable`, `Iterator`, or providing an `iterator()` operator function.
- Prefer `forEach { }` (functional style) when you don't need `break`/`continue`, since `for` loops support control flow that lambdas do not.
