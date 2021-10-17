package composite.recursive

data class Department(
    var name: String,
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
