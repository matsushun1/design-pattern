package iterator.books

import java.util.*
import kotlin.collections.ArrayList

/**
 * 本棚が集合体であることを宣言する
 */
class BookShelf(maxsize: Int) : Aggregate {

//    private val books: Array<Book?> = arrayOfNulls(maxsize)
    private var books = java.util.ArrayList<Book>(maxsize)
    private var last: Int = 0

    fun getBookAt(index: Int): Book {
        return books[index]
    }

    fun appendBook(book: Book) {
//        this.books[last] = book
        books.add(book)
        last++
    }

    fun getLength(): Int {
        return last
    }

    /**
     * 本棚の本を数える
     * 走査はBookShelfIteratorから直接呼び出さず、あくまでIteratorのメソッドを使う
     */
    override fun iterator(): Iterator {
        return BookShelfIterator(this)
    }

}
