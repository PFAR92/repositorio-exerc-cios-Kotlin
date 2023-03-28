fun main() {
    val precoCoca = 3.5
    val precoPepsi = 2.5
    val precoFanta = 2.0

    println("Bem-vindo(a) à máquina de venda automática!")
    println("As bebidas disponíveis são Coca-Cola, Pepsi e Fanta.")
    print("Insira o valor em dinheiro: ")
    val valorInserido = readLine()?.toDoubleOrNull() ?: 0.0

    println("Qual bebida você deseja comprar?")
    println("1. Coca-Cola (R$ $precoCoca)")
    println("2. Pepsi (R$ $precoPepsi)")
    println("3. Fanta (R$ $precoFanta)")
    print("Opção: ")
    val opcao = readLine()?.toIntOrNull() ?: 0

    val precoBebida = when (opcao) {
        1 -> precoCoca
        2 -> precoPepsi
        3 -> precoFanta
        else -> 0.0
    }

    if (precoBebida == 0.0) {
        println("Opção inválida.")
        return
    }

    if (valorInserido >= precoBebida) {
        val troco = valorInserido - precoBebida
        println("Compra realizada com sucesso!")
        println("Seu troco: R$ $troco")
    } else {
        println("Valor insuficiente para comprar a bebida.")
    }
}
