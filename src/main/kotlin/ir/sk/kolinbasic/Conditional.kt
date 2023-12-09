package ir.sk.kolinbasic

fun main() {
    println(maxOf(2, 6))

    // foreach
    val items = listOf("first", "second", "third")
    for(item in items) {
        println(item)
    }

    // for
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }

    // while
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }


    // range
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range")
    }

    // not in range
    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }

    // iterate over a range
    for (x in 1..5) {
        print(x)
    }

    // Progression
    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }
}

// if
fun maxOf(a: Int, b: Int) = if (a > b) a else b

fun descripe(obj: Any): String =
    when (obj) {
        1 -> "One"
        "Hello" -> "Greating"
        is Long -> "Long"
        !is String -> "Not a String"
        else -> "Unknown"
    }

