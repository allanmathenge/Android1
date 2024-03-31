fun main(args: Array<String>) {

    val myself = User1("Allan")

    val user1 = User1("John", "Doe")

    val friend = User1("John", "Doe", 21)

    val friend1 = User1("John", "Doe", 24, "US")

    println("\n")

    println("Myself name = ${myself.name}, last name = ${myself.lastName}, age = ${myself.age}, location = ${myself.location}")
    println("User1's name = ${user1.name}, last name = ${user1.lastName}, age = ${user1.age}, location = ${user1.location}")
    println("Friend's name = ${friend.name}, last name = ${friend.lastName}, age = ${friend.age}, location = ${friend.location}")
    println("Friend1's name = ${friend1.name}, last name = ${friend1.lastName}, age = ${friend1.age}, location = ${friend1.location}")
}

class User1(var name: String, var lastName: String, var age: Int, var location: String) {

    constructor(name: String) : this(name, "none", 0, "none") {
        println("2nd - added default argument values $lastName, $age and $location")
    }

    constructor(name: String, lastName: String) : this(name, lastName, 0, "none") {
        println("3rd - added default argument values $age and $location")
    }

    constructor(name: String, lastName: String, age: Int) : this(name, lastName, age, "none") {
        println("4th - added default argument value $location")
    }
}