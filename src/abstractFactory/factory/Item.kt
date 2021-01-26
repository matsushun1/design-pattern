package abstractFactory.factory

/**
 * 抽象的な部品。項目を表すクラス。captionは見出し
 */
abstract class Item(protected val caption: String) {
    abstract fun makeHTML(): String // HTMLの文字列が返るように実装する
}
