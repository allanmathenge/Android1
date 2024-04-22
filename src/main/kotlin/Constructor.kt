fun main(args: Array<String>){
    val car1 = VehicleMode("  Tesla  ", "S Plaid", "Red", 4)

    println("Vehicle name = ${car1.name}")
    println("Vehicle model = ${car1.model}")
    println("Vehicle color = ${car1.color}")
    println("Vehicle doors = ${car1.doors}")

    car1.move()
    car1.stop()

    println("\n")

    val car2 = VehicleMode("Ford", "Mustang", "Red", 2)

    println("The Vehicle is = ${car2.name}!")
    println("The vehicle is = ${car2.model} model!")
    println("The vehicle is = ${car2.color} in color!")
    println("The vehicle has = ${car2.doors} doors!")

    car2.move()
    car2.stop()
}

class VehicleMode(name: String, var model: String, var color: String, var doors: Int) {

    // Assigning params to variables in properties is necessary when only some work need done on arguments, as shown
    // for example trim() for spaces on strings

    var name = name.trim()

    fun move() {
        println("The car $name is moving!")
    }

    fun stop() {
        println("The car $model has stopped!")
    }
}