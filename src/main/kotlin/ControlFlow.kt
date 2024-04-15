fun main() {
    val alarm = 7
    val time = 8

    val text = when {
        alarm == time || alarm == 7 -> "The time is either $alarm or $time"
        alarm >= 10 -> "The number is in range 1..12"
        else -> "The time is $alarm"
    }
    println(text)
}