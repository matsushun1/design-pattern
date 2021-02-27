package bridge

/**
 * Displayクラスに機能を拡張したクラス
 * 継承することで機能を追加している
 */
class CountDisplay(private val impl: DisplayImpl) : Display(impl) {
    // times回繰り返し表示する
    fun multiDisplay(times: Int) {
        impl.rawOpen() // 継承したメソッドを使って新しいメソッドを追加
        for (i in 1..times) {
            impl.rawPrint()
        }
        impl.rawClose()
    }

}
