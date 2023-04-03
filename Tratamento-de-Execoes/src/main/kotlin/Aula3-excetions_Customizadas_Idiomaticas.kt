class IllegalVoterException(message: String) : Throwable(message)

@Throws(IllegalVoterException::class)
fun vote(name: String, age:Int) {
    if (age < 16) {
        throw IllegalVoterException("$name não pode votar")
    }
    println("Voto de $name realizado com sucesso")
}

fun main() {
    var quantidadeVotos = 0
    quantidadeVotos += try { vote("Paulo", 31); 1 } catch (e:IllegalVoterException) {0}
    quantidadeVotos += try { vote("João", 12); 1 } catch (e:IllegalVoterException) {0}
    quantidadeVotos += try { vote("Mano", 23); 1 } catch (e:IllegalVoterException) {0}
    println(quantidadeVotos)
}