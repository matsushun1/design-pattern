package composite.recursive

data class Company(override var name: String, override var parent: Component? = null) : Component {

    // 子会社・部門を保持
    private var components = mutableListOf<Component>()

    override fun getGrossProfit(): Long {
        return this.components.fold(0L) { sum, component -> sum + component.getGrossProfit() }
    }

    override fun getProductivity(): Long {
        return this.components.fold(0L) { sum, component -> sum + component.getProductivity() } / this.components.size
    }

    // 子会社・部門を追加
    fun add(component: Component): Company {
        component.parent = this
        this.components.add(component)
        return this
    }

    fun getDescendants(separator: String = ">"): String {
        return this.components.joinToString(prefix = this.name) { separator + it.name }
    }

    fun getAllParents(component: Component = this, separator: String = ">"): String {
        return if (component.parent == null) {
            component.name
        } else {
            separator + component.parent!!.name + getAllParents(component = component.parent!!)
        }
    }

}
