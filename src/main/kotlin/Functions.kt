fun main(args: Array<String>) {
    sayHello("World", 22)

    val hasInternetConnection = false

    if (hasInternetConnection){
        getData("Connected")
    } else {
        showMessage()
    }
}

fun sayHello(name: String, age: Int) {
    val num = age
    println("Hello $name, Your age is $age, lucky number is $num")
}

fun getData(data: String) {
    println("Your internet is $data")
}

fun showMessage() {
    println("No internet connection")
}