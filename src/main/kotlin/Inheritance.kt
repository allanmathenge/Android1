fun main(args: Array<String>) {
    val car = Car("BMW", "black", 1, 1)
    val plane = Plane("Boeing", "white", 4, 4)

    car.move()
    car.stop()

    println()

    plane.move()
    plane.stop()
}

open class Vehicle(val name: String, val color: String) {
    open fun move() {
        println("$name is moving")
    }

    fun stop() {
        println("$name has stopped")
    }
}

class Car(name: String, color: String, val engines: Int, val door: Int) : Vehicle(name, color) {

}

class Plane(name: String, color: String, val engines: Int, val door: Int): Vehicle(name, color) {
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