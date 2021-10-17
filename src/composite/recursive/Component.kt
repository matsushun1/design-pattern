package composite.recursive

interface Component {
    var name: String
    var parent: Component?
    fun getGrossProfit(): Long
    fun getProductivity(): Long
}
