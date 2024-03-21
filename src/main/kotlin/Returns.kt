fun main(args: Array<String>) {

    val max = getMax(15, 7)
    println(max)
}

fun getMax(a: Int, b: Int) = if (a > b) getMax(4.8, 5.6, 6.0) else getMax(4, 5, 7)

fun getMax(a: Double, b: Double) = if (a > b) a else b

fun getMax(a: Int, b: Int, c: Int): Int {
    return if (a >= b && a >= c) {
        a
    } else if (b >= a && b >= c) {
        b
    } else {
        c
    }
}

fun getMax(a: Double, b: Double, c: Double): Double {
    return if (a >= b && a >= c) {
        a
    } else if (b >= a && b >= c) {
        b
    } else {
        c
    }
}
