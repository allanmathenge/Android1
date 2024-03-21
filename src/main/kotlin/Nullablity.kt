fun main() {
    var text: String? = null

    // Elvis operator

    var text2 = ""

    if (text != null) {
        text2 = text
    } else {
        text2 = "Text is null"
    }
    println(text2)
}