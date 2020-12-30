package templateMethod

class StringDisplay(private val string: String) : AbstractDisplay(){

    private var width: Int = 0

    init {
        this.width = string.toByteArray().size
    }

    override fun open() {
        printLine()
    }

    override fun print() {
        println("|$string|")
    }

    override fun close() {
        printLine()
    }

    private fun printLine() {
        print("+")
        for(i in 0..width) {
            print("-")
        }
        println("+")
    }

}