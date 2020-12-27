package iterator

class Main {
    fun execute() {
        val bookShelf = BookShelf(4)
        bookShelf.appendBook(Book("80日間世界一周"))
        bookShelf.appendBook(Book("聖書"))
        bookShelf.appendBook(Book("シンデレラ"))
        bookShelf.appendBook(Book("足長おじさん"))
        val it = bookShelf.iterator() // 本棚を対象としたiteratorを作成する
        // 使っているのはhasNext()とnext()なので、BookShelfの実装に依存していない
        // 集合体を表すパターンが配列ではなく、リストになると別途実装方法をその場で変更しなければならない
        while (it.hasNext()) {
            val book = it.next() as Book
            println(book.name)
        }
    }
}