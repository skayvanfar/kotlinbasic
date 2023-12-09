package ir.sk.kolinbasic

fun main() {
    val items = listOf("first", "second", "third")

    // iteration
    for (item in items) {
        println(item)
    }

    // stream
    items
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }

    //automatic casting
    val a : Any = 10;
    if (a is String) {
        // `obj` is automatically cast to `String` in this branch
        println(a.length)
    }
}
