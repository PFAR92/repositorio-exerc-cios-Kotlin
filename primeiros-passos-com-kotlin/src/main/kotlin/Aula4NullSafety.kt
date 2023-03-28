fun main() {
    var nuncaNull: String = "não pode ser nula"
    //nuncaNull = null

    var aceitaNull: String? = "pode ser nula"
    aceitaNull = null

    var naoNull = "o copilador assume ser string, não pode ser nula"
    //naoNull = null

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(nuncaNull))
    //strLength(aceitaNull)

    fun descrevaString(palavra: String?) : String {
        if (palavra != null && palavra.length > 0){
            return "Essa palavra tem um tamanho ${strLength(palavra)}"
        } else {
            return "Essa palavra é vazia ou nula"
        }
    }

    println(descrevaString(null))
    println(descrevaString(""))
    println(descrevaString("teste"))
}