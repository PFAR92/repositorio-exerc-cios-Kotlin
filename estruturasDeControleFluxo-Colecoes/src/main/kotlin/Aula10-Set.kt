val numeros: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)

fun addNumeros(uniqueDesc: Int): Boolean {
    return numeros.add(uniqueDesc)
}

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "foi adicionado" else "rejeitado, valor duplicado"
}

fun main() {
    val novoNumero: Int = 9
    val novoNumero2: Int = 3

    println("emitiu $novoNumero ${getStatusLog(addNumeros(novoNumero))}")
    println("emitiu $novoNumero2 ${getStatusLog(addNumeros(novoNumero2))}")
}