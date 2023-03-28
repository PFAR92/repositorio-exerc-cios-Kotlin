fun main() {
    val numeros = listOf(1, -2, 3, -4, 5, -6)
    val positivos = numeros.filter { x -> x > 0 }
    val negativos = numeros.filter { it < 0 }

    println("números: $numeros")
    println("números positivos: $positivos")
    println("números negativos: $negativos")

    val doubled = numeros.map { x -> x * 2 }
    val tripled = numeros.map { it * 3 }

    println("números multiplicados por 2: $doubled")
    println("números multiplicados por 3: $tripled")

    val anyNegative = numeros.any { it < 0 }
    val anyGt6 = numeros.any { it > 6 }

    println("Tem número negativo? $anyNegative")
    println("Tem número maior que 6? $anyGt6")

    //flat Map

    val fruitsBag = listOf("apple", "orange", "banana", "grapes")
    val clothesBag = listOf("shirts", "pants", "jeans")
    val cart = listOf(fruitsBag, clothesBag)
    val mapBag = cart.map { it }
    val flatMapBag = cart.flatMap { it }

    println("Seu carrinho tem: $mapBag")
    println("the things you bought are: $flatMapBag")
}
