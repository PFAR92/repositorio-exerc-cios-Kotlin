fun main() {

    val customer = Customer()
    val contact = Contact(1, "paulo@gmail.com")
    println(contact.email)

    println(contact.id)
    contact.email = "paulo@hotmail.com"

    println(contact.email)
}

class Customer

class Contact(val id: Int, var email: String)
