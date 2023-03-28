fun main() {
    var a: String = "inicial"
    println(a)
    a = "final" //var é uma variável que pode ser modificada
    println(a)
    val b: Int = 1 //val é imutável
    val c = 3
    println(b)
    println(c)

    fun condicao() = true

    val d: Int

    if (condicao()){
        d = 1
    } else{
        d = 2
    }
    println(d)
}