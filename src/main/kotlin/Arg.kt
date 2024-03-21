fun main(args: Array<String>) {

    sum(1, 4, 5, 6, 7, 10, 9)
}

fun sum(vararg numbers: Int) {
    return numbers.forEach { println(it) }
}