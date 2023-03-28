fun main() {
    addSystemUser(4)
    println("a lista tem: ${getSysSudoers().size}")
    getSysSudoers().forEach {
        i -> println("usuário n: $i")
    }
}

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)
val sudoers: List<Int> = systemUsers

fun addSystemUser(newUser: Int) {
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {
    return sudoers
}