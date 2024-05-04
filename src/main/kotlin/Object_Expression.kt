fun main(args: Array<String>) {

    val loginButton = Button1("Login", 234, object : OnClickListener{
        override fun onClick() {

        }
    })

    val signUpButton = Button1("Sign up", 567, object : OnClickListener{
        override fun onClick() {

        }
    })

}

class Button1(private val text: String, private val id: Int, onClickListener: OnClickListener)

class ClickListener() : OnClickListener {
    override fun onClick() {

    }
}

interface OnClickListener {
    fun onClick()
}