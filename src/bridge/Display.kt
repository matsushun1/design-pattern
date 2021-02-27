package bridge

/**
 * 機能のクラス階層
 * DisplayのAPIがDisplayImplのAPIへ変換されている
 * DisplayImplの各実装メソッドが使われている
 * Kotlinの移譲を使うのもあり
 */
open class Display(private val impl: DisplayImpl): DisplayImpl by impl {
//    fun open() {
//        impl.rawOpen() // 移譲
//    }
//    fun print() {
//        impl.rawPrint() // 移譲
//    }
//    fun close() {
//        impl.rawClose() // 移譲
//    }
    fun display() {
        impl.rawOpen()
        impl.rawPrint()
        impl.rawClose()
    }
}
