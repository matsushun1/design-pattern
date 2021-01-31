package bridge

/**
 * Displayクラスに機能を拡張したクラス
 */
class CountDisplay(impl: DisplayImpl) : Display(impl) {
    // times回繰り返し表示する
    fun multiDisplay(times: Int) {
        open()
        for (i in 0..times) {
            print()
        }
        close()
    }

}
