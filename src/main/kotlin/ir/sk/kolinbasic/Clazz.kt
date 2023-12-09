package ir.sk.kolinbasic

fun main() {
    val rectangle = Rectangle(2.4, 5.4)
    println("The perimeter  is ${rectangle.perimeter}")
}

class Rectangle(val height: Double, val length: Double) {
    val perimeter = (height + length) * 2
}
