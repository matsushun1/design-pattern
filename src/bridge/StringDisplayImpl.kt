package bridge

/**
 * 実装のクラス階層
 */
class StringDisplayImpl(private val string: String) : DisplayImpl {
    private var width = 0

    init {
        width = string.toByteArray().size
    }

    override fun rawOpen() {
        printLine()
    }

    override fun rawPrint() {
        println("|${string}|")
    }

    override fun rawClose() {
        printLine()
    }

    private fun printLine() {
        print("+")
        for (i in 1..width) {
            print("-")
        }
        println("+")
    }
}
