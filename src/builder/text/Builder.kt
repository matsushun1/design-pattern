package builder.text

/**
 * インスタンスの作成形式
 */
abstract class Builder {
    abstract fun makeTitle(title: String)
    abstract fun makeString(str: String)
    abstract fun makeItems(items: MutableList<String>)
    abstract fun close()
}
