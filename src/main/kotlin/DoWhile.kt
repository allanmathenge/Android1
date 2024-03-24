fun main(args: Array<String>){
    // while loop executes as long condition is true

    var number = 0
    while (number < 10) {
        number++
        if (number == 7) {
            break
        }
        println(number)
    }

    for (i in 1 .. 10) {
        if (i in 3..8) continue
        println(i)
    }

    for ( i in 1..10){
        if (i == 5) break
        println(i)
    }
}