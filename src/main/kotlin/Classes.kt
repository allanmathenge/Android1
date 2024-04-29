class Aeroplane(name: String, var model: String, var color: String, var doors: Int){
    var name = name.trim()

    fun move(){
        println("The aeroplane $name is moving!")
    }
    fun stop(){
        println("The aeroplane $model has stopped!")
    }

    val min = Calculator1()

}

class User12(var firstName: String, var lastName: String, var age: Int) {

    lateinit var favoriteMovie: String
}

class Calculator1() {
    companion object {
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }
}