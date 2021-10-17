package visitor

class File(val name: String, private val size: Int): Entry() {
    override fun getSize(): Int {
        return this.size
    }

    override fun accept(v: Visitor) {
        v.visit(this)
    }

    override fun toString(): String {
        return "${this.name} (${this.size})"
    }
}
