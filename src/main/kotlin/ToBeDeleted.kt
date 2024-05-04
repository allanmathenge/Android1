fun main(args: Array<String>) {

}

class App1: B1 by Mobile1(), B3 by Mobile(), B4 by Mobile2() {
    override fun call() {

    }

    override fun call2() {

    }

    override fun call3() {

    }

}

interface B1 {
    fun call()
}

interface B3 {
    fun call2()
}

interface B4 {
    fun call3()
}

open class Mobile1: B1 {
    override fun call() {

    }
}
open class Mobile: B3 {
    override fun call2() {

    }
}

open class Mobile2: B4 {
    override fun call3() {

    }
}