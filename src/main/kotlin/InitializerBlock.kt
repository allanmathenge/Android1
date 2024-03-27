fun main(args: Array<String>){

    val user = User("Allan", "George", 26)

    val friend = User("John", "Smith", 28)

    println("I am ${user.name} and my friend's name is ${friend.name}")
}

class User(name: String, var lastName: String, var age: Int) {

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