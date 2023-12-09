package ir.sk.kolinbasic

fun main() {
    val myObject = object : MyAbstractClass() {
        override fun doSomething() {
            // ...
        }

        override fun sleep() { // ...
        }
    }
    myObject.doSomething()
}

open class Shape

// inheritance
class NewRectangle(val height: Double, val length: Double): Shape() {
    val perimeter = (height + length) * 2
}

// abstraction
abstract class MyAbstractClass {
    abstract fun doSomething()
    abstract fun sleep()
}

