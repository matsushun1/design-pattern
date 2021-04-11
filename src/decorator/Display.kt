package decorator

/**
 *  複数行から成る文字列を表示するための抽象クラス
 */
abstract class Display {
    abstract fun getColumns(): Int // 横の文字数を取得する
    abstract fun getRows(): Int // 縦の行数を取得する
    abstract fun getRowText(row: Int): String? // row番目の行の文字列を取得する

    fun show() { // 全て表示する
        for (i in 0 until getRows()) {
            println(getRowText(i))
        }
    }
}
