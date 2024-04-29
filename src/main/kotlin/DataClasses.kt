fun main(args: Array<String>) {
    val user10 = User10("Allan", "Mathenge", 26)
    val user11 = User10("Allan", "Mathenge", 26)

    println(user10.equals(user11))
    println(user10 == user11)

    println(user10)
    println(user11)
}

class User10(private var firstName: String, private var lastName: String, private var age: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) { // comparing the object with itself
            return true
        }

        if (other is User10) { // `this` refers to user10 checking to see if other is a User10 object
            return this.firstName == other.firstName
                    && this.lastName == other.lastName
                    && this.age == other.age
        }
        return false
    }

    override fun hashCode(): Int {
        return 0
    }

    override fun toString(): String {
        return "User10(firstName : '$firstName', lastName : '$lastName', age : '$age')"
    }
}