fun main(args: Array<String>) {

    // Operators

    var x = 5
    val y = 3

    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}") // Modulus outputs remainder

    println()

    var result = x + y

    result += 2
    println("result from x = $result")

    result -= 2
    println("result from x = $result")

    result *= 2
    println("result from x = $result")

    result /= 2
    println("result from x = $result")

    result %= 2
    println("result from x = $result")

    println()

    println("(3 + 3) * 4 = ${(3 + 3) * 4}")

    println()

    // 1.End of line comment
    /*2. block comment */


    x = 0
    println("x = ${x++}")
    println("x = ${++x}")

    println()
    println("x = ${x--}")
    println("x = ${--x}")

    println()

    val num = 100

    if (num != 150) {
        println("The number is not 150")
    } else if (num <= 150) {
        println("The number is greater than 150")
    } else {
        println("All conditions failed")
    }

    println()

    val isActive = false
    if (!isActive){
        println("The user is active")
    }else {
        println("The user is not active")
    }
}