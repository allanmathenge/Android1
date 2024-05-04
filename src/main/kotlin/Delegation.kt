fun main(args: Array<String>) {

}

class App0: A0 by FirstDelegate0(), B0 by SecondDelegate0(), C0 by ThirdDelegate0(), D0 by FourthDelegate0() {
    override fun print() {

    }

    override fun print2() {

    }

    override fun print3() {

    }

    override fun print4() {

    }
}

interface A0 {
    fun print()
}

interface B0 {
    fun print2()
}

interface C0 {
    fun print3()
}

interface D0 {
    fun print4()
}

open class FirstDelegate0 : A0 {
    override fun print() {

    }
}

open class SecondDelegate0 : B0 {
    override fun print2() {

    }
}

open class ThirdDelegate0 : C0 {
    override fun print3() {

    }
}

open class FourthDelegate0 : D0 {
    override fun print4() {

    }
}
