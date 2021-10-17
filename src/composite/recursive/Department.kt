package composite.recursive

data class Department(
    override var name: String,
    override var parent: Component? = null,
    var earnings: Long,
    var cost: Long,
    var numOfWorkers: Long,
    var workingTime: Long
) : Component {

    override fun getGrossProfit(): Long {
        return this.earnings - this.cost
    }

    override fun getProductivity(): Long {
        return this.getGrossProfit() / (this.numOfWorkers * this.workingTime)
    }
}
