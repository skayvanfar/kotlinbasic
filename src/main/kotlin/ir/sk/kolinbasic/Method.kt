package ir.sk.kolinbasic

fun main() {

    var a = 10;
    var b: Int
    b = 20;
    println(sum(a, b))
    println(inlineSum(5, 7))
}

fun sum(a: Int, b: Int) : Int {
    return a + b;
}

fun inlineSum(a: Int, b: Int) = a + b;


