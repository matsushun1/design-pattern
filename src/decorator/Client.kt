package decorator

class Client {
    fun execute() {
        val b1 = StringDisplay("Hello, world.")
        val b2 = SideBorder(b1, '#')
        val b3 = FullBorder(b2)
        b1.show()
        b2.show()
        b3.show()

    }
}
