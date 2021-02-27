package strategy

class Hand(private val handValue: Int) {
    companion object {
        private const val HAND_GUU = 0
        private const val HAND_CHO = 1
        private const val HAND_PAA = 2
        private val name = arrayListOf("グー", "チョキ", "パー")
        private val hand = arrayListOf(Hand(HAND_GUU), Hand(HAND_CHO), Hand(HAND_PAA))
        fun getHand(handValue: Int): Hand {
            return hand[handValue]
        }
    }

    private fun fight(h: Hand) : Int {
        return when {
            this == h -> 0
            (this.handValue + 1) % 3 == h.handValue -> 1
            else -> -1
        }
    }

    fun isStrongerThan(h: Hand): Boolean {
        return fight(h) == 1
    }

    fun isWeakerThan(h: Hand): Boolean {
        return fight(h) == -1
    }

    override fun toString(): String {
        return name[handValue]
    }
}
