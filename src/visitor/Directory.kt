package visitor

class Directory(val name: String): Entry() {
    private val dir = arrayListOf<Entry>()

    override fun getSize(): Int {
        val size = 0
        val it = dir.iterator()
        while (it.hasNext()) {
            val entry = it.next()
            entry.getSize()
        }
        return size
    }
    override fun accept(v: Visitor) {
        v.visit(this)
    }
    override fun toString(): String {
        return "${this.name} (${this.getSize()})"
    }
    override fun add(entry: Entry): Entry {
        dir.add(entry)
        return this
    }
    override fun iterator(): Iterator<Entry> {
        return dir.asIterable().iterator()
    }
}
