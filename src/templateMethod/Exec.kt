package templateMethod

class Exec {
    fun execute() {
        val d1: AbstractDisplay = CharDisplay('H')
        val d2: AbstractDisplay = StringDisplay("Hello")
        val d3: AbstractDisplay = StringDisplay("こんにちは")

        d1.display()
        d2.display()
        d3.display()
    }
}