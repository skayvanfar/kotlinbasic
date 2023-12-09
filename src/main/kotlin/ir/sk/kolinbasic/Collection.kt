package ir.sk.kolinbasic

fun main() {
    // list
    val items = listOf("first", "second", "third")

    // map
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    println(map["key"])
    val mutableMap = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    mutableMap["a"] = 3

    // iteration
    for (item in items) {
        println(item)
    }

    for ((k, v) in map) {
        println("$k -> $v")
    }

    // stream
    items
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }

    // automatic casting
    val a : Any = 10;
    if (a is String) {
        // obj` is automatically cast to `String` in this branch
        println(a.length)
    }

}
