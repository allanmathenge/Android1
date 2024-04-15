fun main(args: Array<String>) {
//    for(direction in Direction.entries){
//        println(direction)
//    }

    val direction = Direction.valueOf("east".uppercase())
    when(direction) {
        Direction.EAST -> println("The direction is east")
        Direction.NORTH -> println("The direction is north")
        Direction.SOUTH -> println("The direction is south")
        Direction.WEST -> println("The direction is west")
    }

    val direction1 = Direction.valueOf("north".uppercase())
    when(direction1) {
        Direction.EAST -> println("The direction is east")
        Direction.NORTH -> println("The direction is north")
        Direction.SOUTH -> println("The direction is south")
        Direction.WEST -> println("The direction is west")
    }

    val direction2 = Direction.valueOf("south".uppercase())
    when(direction2) {
        Direction.EAST -> println("The direction is east")
        Direction.NORTH -> println("The direction is north")
        Direction.SOUTH -> println("The direction is south")
        Direction.WEST -> println("The direction is west")
    }

    val direction3 = Direction.valueOf("west".uppercase())
    when(direction3) {
        Direction.EAST -> println("The direction is east")
        Direction.NORTH -> println("The direction is north")
        Direction.SOUTH -> println("The direction is south")
        Direction.WEST -> println("The direction is west")
    }
}

enum class Direction(var direction: String, var distance: Int) {
    NORTH("north", 10),
    SOUTH("south", 20),
    EAST("east", 15),
    WEST("west", 40)
}