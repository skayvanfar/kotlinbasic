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

open class Shape {
    open val vertexCount: Int = 0

    open fun draw() {

    }
}

// override
class NewRectangle(val height: Double, val length: Double): Shape() {
    val perimeter = (height + length) * 2
    override val vertexCount = 4

    override fun draw() { /*...*/ }
}

// abstraction
abstract class MyAbstractClass {
    abstract fun doSomething()
    abstract fun sleep()
}

