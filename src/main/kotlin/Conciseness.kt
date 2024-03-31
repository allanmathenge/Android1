fun main(args: Array<String>) {

    val user = User()
    val friend = User(firstName="John", lastName = "Doe", age = 70)
    val user2 = User(age = 90, lastName = "Doe", firstName = "Jane")

    println("User2's first name = ${user2.firstName}, last name = ${user2.lastName}, age = ${user2.age}!")
    println("User's first name = ${user.firstName}, last name = ${user.lastName}, age = ${user.age}")
    println("Friend's first name = ${friend.firstName}, last name = ${friend.lastName}, age = ${friend.age}")

}

class User(var firstName: String = "none", var lastName: String = "none", var age: Int = 30) {

}