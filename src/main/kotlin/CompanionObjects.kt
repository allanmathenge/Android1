fun main(args: Array<String>) {

    val result = Calculator.sum(5, 10)
    val max = Int.MAX_VALUE
    println(max)

    println("5 + 10 = $result")
}

class Calculator() {
    companion object {
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }
}