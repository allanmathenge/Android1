fun main(args: Array<String>) {
    println(Direction1.NORTH.direction)
    println(Direction1.NORTH.distance)
    println(Direction1.NORTH.name)
    Direction1.NORTH.printData()
    println()

    println(Direction1.SOUTH.direction)
    println(Direction1.SOUTH.distance)
    println(Direction1.SOUTH.name)
    Direction1.SOUTH.printData()
    println()

    println(Direction1.EAST.direction)
    println(Direction1.EAST.distance)
    println(Direction1.EAST.name)
    Direction1.EAST.printData()
    println()

    println(Direction1.WEST.direction)
    println(Direction1.WEST.distance)
    println(Direction1.WEST.name)
    Direction1.WEST.printData()
}

enum class Direction1(var direction: String, var distance: Int) {
    NORTH("north", 10),
    SOUTH("south", 20),
    WEST("west", 15),
    EAST("east", 40); // semicolon must be added
    fun printData() {
        println("Direction = $direction and Distance = $distance")
    }
}