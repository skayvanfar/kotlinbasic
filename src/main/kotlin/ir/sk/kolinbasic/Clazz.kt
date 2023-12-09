package ir.sk.kolinbasic

import java.math.BigDecimal

fun main() {
    val rectangle = Rectangle(2.4, 5.4)
    println("The perimeter  is ${rectangle.perimeter}")

    // Configure properties of an object (apply), configuring properties that aren't present in the object constructor.
    val myRectangle = Rectangle(2.1, 4.5).apply {
        //
    }

    // todo
    fun calcTaxes(): BigDecimal = TODO("Waiting for feedback from accounting")

}

class Rectangle(val height: Double, val length: Double) {
    val perimeter = (height + length) * 2

}

// add more constructor
class Person(val name: String) {

    init {
        println("Init block")
    }

    val children: MutableList<Person> = mutableListOf()
    constructor(name: String, parent: Person) : this(name) {
        parent.children.add(this)
    }
}
