fun <G> G?.nullSafeToString() = this?.toString() ?: "Null"

fun main() {
    println(null.nullSafeToString())
    println("Kotlin".nullSafeToString())
}