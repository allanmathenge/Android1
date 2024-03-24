fun main(args: Array<String>) {
    val values = arrayOf( 4, 3, 2, 4, 5, 6)

    max(values)
    min(values)
}

fun max(values: Array<Int>): Int {
    var max = values[0]

    for (i in values){
        if (i > max){
            max = i
        }
    }
    println(max)
    return max
}

fun min(values: Array<Int>): Int {
    var min = values[0]

    for (i in values){
        if (i < min){
            min = i
        }
    }
    println(min)
    return min
}