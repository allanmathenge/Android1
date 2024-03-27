fun main(args: Array<String>) {

    val values = arrayOf(48, 30, 21, 46, 53, 60)
    val max = findMinAndMax(values, true)
    val min = findMinAndMax(values, false)

    println("The max value = $max the min value = $min")


    // val min = findMin(values)
    // val max = findMax(values)

   // println("Minimum value = $min, Maximum value = $max")
}

fun findMin(values: Array<Int>): Int {
    var min = values[0]

    for (i in values){
        if (i < min){
            min = i
        }
    }
    return min
}

fun findMax(values: Array<Int>): Int {
    var max = values[0]

    for (i in values){
        if (i > max){
            max = i
        }
    }
    return max
}

fun findMinAndMax(values: Array<Int>, searchMax: Boolean): Int {
    var max = values[0]
    var min = max

    if (searchMax) {
        for (i in values) {
            if (i > max) {
                max = i
            }
        }
        return max
    } else {
        for (i in values) {
            if (i < min) {
                min = i
            }
        }
    }
    return min
}