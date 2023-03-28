fun main() {
    val stack2 = mutableStackOf(0.62, 3.14, 3.7)
    println(stack2)
}
fun <E> mutableStackOf(vararg elements: E) = MutableStack2(*elements)

class MutableStack2<E>(vararg itens: E) {
    private val elements =itens.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()}}"
}