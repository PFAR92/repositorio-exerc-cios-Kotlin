open class Cachorro {
    open fun latido(){
        println("wow wuw!")
    }
}

class Basset : Cachorro() {
    override fun latido() {
        println("haaw haaw haaw")
    }
}

fun main() {
    val cachorro: Cachorro = Basset()
    cachorro.latido()
}