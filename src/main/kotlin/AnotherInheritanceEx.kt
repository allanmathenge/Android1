fun main(args: Array<String>) {
    val view = View()
    val button = Button("Login", "Center")
    val roundButton = RoundButton("Sign Up", "center", 30)

    view.draw()
    button.draw()
    roundButton.draw()
}

open class View() {
    open fun draw() {
        println("Drawing the view.")
    }
}

open class Button(val text: String, val orientation: String) : View() {
    override fun draw() {
        // code for drawing a button
        println("Drawing the button")
        super.draw()
    }
}

class RoundButton(text: String, orientation: String, private val coners: Int) : Button(text, orientation) {
    override fun draw() {
        println("Drawing a round button has $coners")
        super.draw()
    }
}