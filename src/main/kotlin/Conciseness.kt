fun main(args: Array<String>) {
    val user = User4()
    val friend = User4(firstName = "John", lastName = "Doe", age = 70)
    val user2 = User4(age = 90, lastName = "Doe", firstName = "Jane")
    user.firstName = "Vlad"

    println(" = ${user2.firstName}, last name = ${user2.lastName}, age = ${user2.age}!")
    println(" = ${user.firstName}, last name = ${user.lastName}, age = ${user.age}")
    println(" = ${friend.firstName}, last name = ${friend.lastName}, age = ${friend.age}")
}

//`property values are returned by getters -> Encapsulation hiding/protecting inner workings of a class from outside access
class User4(firstName: String = "none", var lastName: String = "none", var age: Int = 30) {
    var firstName = firstName

    // Single body/line expression function

//        get() = field
//        set(value) {
//            field = value
//        }

//        get() { // return property values
//            return "FirstName: $field"
//        }
//
//        set(value) { // updates property value
//            field = value // replacing field with firstName is like calling setter again
//        }

//    fun setFirstName(newValue: String) { //Updating the firstName
//        this.firstName = newValue
//    }
//
//    fun getFirstName() : String { // Returning that firstName
//        return this.firstName
//    }
}