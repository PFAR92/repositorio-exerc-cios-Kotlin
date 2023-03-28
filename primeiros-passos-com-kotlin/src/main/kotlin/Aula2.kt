fun main() {
    fun printAll(vararg messages: String) {
        for (m in messages) println(m)
    }
    printAll("olá", "oi", "tudo blz", "ok")

    fun printAllWhithPrefix(vararg messages: String, prefix: String) {
        for (m in messages) println(prefix + m)
    }
    printAllWhithPrefix(
        "olá", "tudo bom", "tranquilo",
        prefix = "Saudação: "
    )
    fun log(vararg entries: String) {
        printAll(*entries)
    }
    log("teste")

}