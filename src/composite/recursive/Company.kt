package composite.recursive

data class Company(var name: String) : Component {

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
        this.components.add(component)
        return this
    }
}
