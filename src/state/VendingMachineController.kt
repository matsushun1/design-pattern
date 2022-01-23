package state

/**
 * Contextを実現するためのインターフェース
 * 状態ごとの振る舞いを定義
 */
interface VendingMachineController {
    fun lock() {}
    fun unlock() {}
    fun provideDrink() {}
    fun alarm() {}
}