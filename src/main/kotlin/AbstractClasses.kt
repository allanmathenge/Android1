fun main(args: Array<String>) {

    val car = Car("BMW", "BLACK", 1, 4)
    car.move()
    car.stop()
}

abstract class Vehicle {

    abstract fun move()
    abstract fun stop()
}

class Car(private val name: String, private val color: String, private val engine: Int, private val doors: Int) : Vehicle() {
    override fun move() {
        println("The $name color $color is moving.")
    }
    override fun stop() {
        println("The car $name color: $color with engines: $engine has stopped")
    }
}
