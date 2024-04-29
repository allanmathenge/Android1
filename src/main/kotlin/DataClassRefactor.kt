fun main(args: Array<String>) {
    val user8 = User8("Allan", "Mathenge", 26)
    val user9 = User8("Allan", "Mathenge", 26)

    println(user8.equals(user9))
    println(user8 == user9)

    println(user8)
    println(user9)
}

data class User8(private var firstName: String, private var lastName: String, private var age: Int)