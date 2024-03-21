fun main(args: Array<String>) {
    sendMessage(
        name = "Allan"
    )
}

fun sendMessage(name: String = "User", message: String = sendText()) {
    println("Name = $name and message = $message!")
}

fun sendText() = "Hello there"
