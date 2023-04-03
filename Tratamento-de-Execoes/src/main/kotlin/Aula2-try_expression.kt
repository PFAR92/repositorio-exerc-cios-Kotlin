fun main() {
    val a = 10
    val b = 0

    val divisao = try { a/b } catch (e: ArithmeticException) { 0 }

    println(divisao)
}