fun main() {
    cases("hello")
    cases(1)
    cases(1L)
    cases(MinhaClasse())
    cases("Hello")
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("one")
        "hello" -> println("Olá")
        is Long -> println("Long")
        !is String -> println("Não é uma string")
        else -> println("foi nenhum")
    }
}

class MinhaClasse