package bridge

class Client {

    fun execute () {
        val d1: Display = Display(StringDisplayImpl("Hello, Japan."))
        val d2: Display = CountDisplay(StringDisplayImpl("Hello, World."))
        val d3: CountDisplay = CountDisplay(StringDisplayImpl("Hello, Universe."))

        d1.display()
        d2.display()
        d3.multiDisplay(5)
    }

}
