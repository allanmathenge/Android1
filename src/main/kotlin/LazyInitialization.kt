fun main(args: Array<String>) {

    val user0 = User0("Allan", "Mathenge", 26)
    val user3 = User0("John", "Doe", 26)

    val user1 by lazy {
        User0("User1", "lastName", 0)
    }
   println(user1.firstName) // Only initialed when called
}

class User0(var firstName: String, var lastName: String, var age: Int) {
    init {
        println("User: $firstName was created")
    }
}