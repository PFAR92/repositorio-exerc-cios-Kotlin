data class Item(val name: String, val price: Float)

data class Order(val items: Collection<Item>)

fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull {
    it.price }?.price ?:0F
fun Order.maxPricedItemName() = this.items.maxByOrNull {
    it.price }?.name ?: "No products"

val Order.commaDelimitedItemName: String
    get() = items.map { it.name }.joinToString()

fun main() {
    val order = Order(listOf(Item("Pão Frances", 0.80F),
        Item("Leite", 4.75F), Item("Água", 1.99F)))

    println("Max priced item name: ${order.maxPricedItemName()}")
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemName}")
}
