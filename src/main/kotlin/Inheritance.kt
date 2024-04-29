fun main(args: Array<String>) {
    val car = Car10("BMW", "black", 1, 1)
    val plane = Plane10("Boeing", "white", 4, 4)

    car.move()
    car.stop()

    println()

    plane.move()
    plane.stop()
}

open class Vehicle10(val name: String, val color: String) {
    open fun move() {
        println("$name is moving")
    }

    fun stop() {
        println("$name has stopped")
    }
}

class Car10(name: String, color: String, val engines: Int, val door: Int) : Vehicle10(name, color) {

}

class Plane10(name: String, color: String, val engines: Int, val door: Int): Vehicle10(name, color) {
    override fun move() {
        flying()
        land()
        super.move()
    }
    private fun flying() {
        println("The plane is flying.")
    }
    private fun land() {
        println("The plane has landed")
    }
}