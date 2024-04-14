fun main(args: Array<String>) {
    for(direction in Direction.entries){
        println(direction)
    }
    println(Direction.NORTH.direction)
    println(Direction.NORTH.distance)
    println(Direction.NORTH.name)
    println()
    println(Direction.SOUTH.direction)
    println(Direction.SOUTH.distance)
    println(Direction.SOUTH.name)
    println()
    println(Direction.EAST.direction)
    println(Direction.EAST.distance)
    println(Direction.EAST.name)
    println()
    println(Direction.WEST.direction)
    println(Direction.WEST.distance)
    println(Direction.WEST.name)
}

enum class Direction(var direction: String, var distance: Int) {
    NORTH("north", 10),
    SOUTH("south", 20),
    EAST("east", 15),
    WEST("west", 40)
}