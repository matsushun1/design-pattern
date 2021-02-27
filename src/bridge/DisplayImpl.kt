package bridge

/**
 * 実装のクラス階層
 * 各メソッドはDisplayクラスのopen, print, closeに対応している
 */
interface DisplayImpl {
     fun rawOpen()
     fun rawPrint()
     fun rawClose()
}
