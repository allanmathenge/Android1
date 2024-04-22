fun main(args: Array<String>) {
    //created real obj initiating the template - Called instantiation. value and property

    val car1 = CarModels()
    car1.name = "Tesla"
    car1.model = "S Plaid"
    car1.color = "Red"
    car1.doors = 4

    println("Name = ${car1.name}")
    println("Model = ${car1.model}")
    println("Color = ${car1.color}")
    println("Doors = ${car1.doors}")

    println(car1.move())
    println(car1.stop())

    println("\n")

    val car2 = CarModels()
    car2.name = "Ford"
    car2.model = "Mustang"
    car2.color = "Blue"
    car2.doors = 2

    println("Name = ${car2.name}")
    println("Model = ${car2.model}")
    println("Color = ${car2.color}")
    println("Doors = ${car2.doors}")

    println(car2.move())
    println(car2.stop())

    val myCar = CarModels()
    myCar.name = "Honda civic"
    myCar.model = "Luxury"
    myCar.color = "White"
    myCar.doors = 4

    println("\n")
    println("My car name = ${myCar.name}")
    println("My car model = ${myCar.model}")
    println("My car color = ${myCar.color}")
    println("My car doors = ${myCar.doors}")

    myCar.move()
    myCar.stop()

    val herCar = CarModels()
    herCar.name = "Hybrid Outback"
    herCar.model = "Luxury car"
    herCar.color = "White"
    herCar.doors = 2

    println("\n")

    println("Her car's name is = ${herCar.name}")
    println("Her car's model is = ${herCar.model}")
    println("Har car's color is = ${herCar.color}")
    println("Her car's doors are = ${herCar.doors}")

    herCar.move()
    herCar.stop()
}

// The Car is our template with states and functionality
class CarModels {
    var name = ""
    var model = ""
    var color = ""
    var doors = 0

    fun move() {
        println("The car $name is moving")
    }

    fun stop() {
        println("The car $name has stopped")
    }
}