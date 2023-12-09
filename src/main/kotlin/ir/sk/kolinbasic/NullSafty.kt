package ir.sk.kolinbasic

import java.io.File

fun main() {
    val files = File(".").listFiles()
    println(files?.size)

    // If-not-null-else shorthand
    // For simple fallback values:
    println(files?.size ?: "empty") // if files is null, this prints "empty"

    // Execute a statement if null
    val map = mapOf("email" to 1, "name" to 2)
    val email = map["email"] ?: throw IllegalStateException("Email is missing!")

    map?.let {
        // execute this block if not null
    }

    // try catch
    fun test() {
        val result = try {
            // count()
        } catch (e: ArithmeticException) {
            throw IllegalStateException(e)
        }

        // Working with result
    }
}
