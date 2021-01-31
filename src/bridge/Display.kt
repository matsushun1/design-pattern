package bridge

/**
 * 機能のクラス階層
 * DisplayのAPIがDisplayImplのAPIへ変換されている
 */
open class Display(private val impl: DisplayImpl) {
    fun open() {
        impl.rawOpen()
    }
    fun print() {
        impl.rawPrint()
    }
    fun close() {
        impl.rawClose()
    }
    fun display() {
        open()
        print()
        close()
    }
}
