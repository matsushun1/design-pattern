package strategy

class Player(private val name: String, private val strategy: Strategy) : Strategy by strategy {
    private var winCount = 0
    private var loseCount = 0
    private var gameCount = 1

    fun win() {
        strategy.study(true)
        winCount++
        gameCount++
    }

    fun lose() {
        strategy.study(false)
        loseCount++
        gameCount++
    }

    fun even() {
        gameCount++
    }

    override fun toString(): String {
        return "[${name}: ${gameCount}games, ${winCount}win, ${loseCount}lose.]"
    }
}
