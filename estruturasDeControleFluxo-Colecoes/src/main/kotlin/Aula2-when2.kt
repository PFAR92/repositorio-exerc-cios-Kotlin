fun main() {
    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MinhaClasse2()))
}

fun whenAssign(obj: Any): Any {
    val resultado = when (obj) {
        1 -> "one"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return resultado
}

class MinhaClasse2


