package visitor

/**
 * 訪問者を受け入れるインターフェース
 */
interface Element {
    fun accept(v: Visitor)
}
