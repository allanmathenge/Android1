fun main(args: Array<String>){
    val names = arrayOf("John", "Steve", "Meg")
    val mixedElements = arrayOf(4, 5, 6, "Name 1", 'a')
    names[0] = "Allan"
    println("First element of the names array ${names[0]}")
    println("The size of the array is: ${names.size}")

    for (i in mixedElements) {
        if ((i is String)){
            println(i)
        }
    }
}