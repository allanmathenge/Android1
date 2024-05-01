fun main(args: Array<String>) {
    val car4 = Car4("BMW", "Black")
    val truck = Truck("Isuzu", "White")
    val plane = Plane("Boeing", "Black and white")
    val tesla = Tesla("mark x", "gray")

    car4.startEngine(2)
    truck.startEngine(3)
    plane.startEngine(4)
    tesla.startEngine(3)

}

interface Engine {
    fun startEngine(doors: Int)
}

class Car4( private val name: String, private val color: String): Engine {
    override fun startEngine(doors: Int) {
        println("The car $name,color=$color with $doors doors is starting the engine.")
    }
}

class Truck(private val name: String, private val color: String): Engine {
    override fun startEngine(doors: Int) {
        println("The truck $name,color=$color with $doors doors is starting the engine.")
    }
}

class Plane(private val name: String, private val color: String) : Engine {
    override fun startEngine(doors: Int) {
        println("The plane $name,color=$color with $doors doors is starting the engine.")
    }
}

class Tesla(private val name: String, private val color: String) : Engine {
    override fun startEngine(doors: Int) {
        println("The Tesla $name,color=$color with $doors doors is starting the engine")
    }
}