package composite

/**
 * FileとDirectoryとを同一視するクラス
 */
abstract class Entry {
    abstract fun getName() : String
    abstract fun getSize() : Int
    open fun add(entry: Entry) : Entry {
        throw FileTreatmentException()
    }

    fun printList() {
        printList("")
    }

    abstract fun printList(prefix: String)

    override fun toString(): String {
        return "${getName()} (${getSize()})"
    }
}
