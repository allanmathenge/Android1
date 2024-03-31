fun main(args: Array<String>){

    val user = Person("Allan", "George", 26)

    val friend = Person("John", "Doe", 28)

    println("I am ${user.name} and my friend's name is ${friend.name}")
}

class Person(name: String, var lastName: String, var age: Int) {

    var name: String = name

    init {
        if (name.lowercase().startsWith("a")) {
            this.name = name
        } else {
            this.name = "User"
            println("The name does not start with the letter -a or -A")
        }
    }
}