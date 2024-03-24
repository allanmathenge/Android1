fun main(args: Array<String>) {
    var number = 1
    val lastNumber = 20
    var evenNumbersCounter = 0

    while (number < lastNumber) {
        number++

        if ((number % 2) != 0) {
            continue
        }

        evenNumbersCounter++
        println(number)
    }

    println("Now we are looping using the for-loop")

    evenNumbersCounter = 0
    for (i in 1..20){
        if ((number % 2) != 0){
            continue
        }
        evenNumbersCounter++
        println(i)
    }

    println()
    println("Even numbers = $evenNumbersCounter")
    println("Even numbers using for loop = $evenNumbersCounter")
}
