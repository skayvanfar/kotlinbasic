package ir.sk.kolinbasic

open class Shape

class NewRectangle(val height: Double, val length: Double): Shape() {
    val perimeter = (height + length) * 2
}
