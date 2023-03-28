class Animal(val nome: String)
class Zoo(val animais: List<Animal>){
    operator fun iterator(): Iterator<Animal> {
        return animais.iterator()
    }
}

fun main() {
    val zoo = Zoo(listOf(Animal("zebra"), Animal("leão")))

    for (animal in zoo) {
        println("o animal é ${animal.nome}")
    }
}