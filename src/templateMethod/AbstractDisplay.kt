package templateMethod

abstract class AbstractDisplay {
    abstract fun open()
    abstract fun print()
    abstract fun close()
    // 唯一実装しているクラス
    fun display() {
        open()
        for (i in 1..5) {
            print()
        }
        close()
    }
}