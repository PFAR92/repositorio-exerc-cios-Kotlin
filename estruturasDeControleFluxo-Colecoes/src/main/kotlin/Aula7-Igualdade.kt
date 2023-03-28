fun main() {
    val autores = setOf("Shakespeare", "Hemingway", "Twain")
    val escritores = setOf("Twain", "Shakespeare", "Hemingway")

    println(autores == escritores)
    println(autores === escritores)
}