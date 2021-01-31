package bridge

/**
 * 実装のクラス階層
 * 各メソッドはDisplayクラスのopen, print, closeに対応している
 */
abstract class DisplayImpl {
    abstract fun rawOpen()
    abstract fun rawPrint()
    abstract fun rawClose()
}
