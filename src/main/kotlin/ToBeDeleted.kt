fun main(args: Array<String>) {
    val sub1 = Submarine("KE Sub", 16)
    val sub2 = Submarine("KE Sub", 16)
    println(sub1 == sub2)


    // While loops

    var num = 0
    while (num <= 5) {
        num++
        println(num)
    }

}

data class Submarine(private val name: String, private val position: Int)

