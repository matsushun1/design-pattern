package iterator

/**
 * BookShelfクラスのスキャンを行うConcreteIterator
 */
class BookShelfIterator(
    private val bookShelf: BookShelf // スキャンする対象
) : Iterator {
    private var index: Int = 0 // 現在注目している本をさす添字

    override fun next(): Any {
        val book: Book = bookShelf.getBookAt(index)
        index++
        return book
    }

    /**
     * 次の本があるかどうか
     * 配列やlistなどの実装に依存されない
     */
    override fun hasNext(): Boolean {
        return index < bookShelf.getLength()
    }
}