package strategy

import java.util.*
import kotlin.random.Random

class WinningStrategy constructor(seed: Int): Strategy {
    private var won = false
    private val random = Random(seed)
    private var prevHand: Hand = Hand.getHand(random.nextInt(3))

    override fun nextHand(): Hand {
        if (!won) prevHand = Hand.getHand(random.nextInt(3))
        return prevHand
    }

    override fun study(win: Boolean) {
        won = win
    }
}
