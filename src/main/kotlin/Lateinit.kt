fun main(args: Array<String>) {

    val user = User3("John", "Doe", 26)
    user.favoriteMovie = "Interstellar"

   // println(user.favoriteMovie)
}

class User3(var firstName: String, var lastName: String, var age: Int) {

    lateinit var favoriteMovie: String

}