package strategy

import kotlin.random.Random

class ProbStrategy(seed: Int) : Strategy {

    private var prevHandValue = 0
    private var currentHandValue = 0
    // history[前回出した手][今回出す手]
    private var history = Array(3) { IntArray(3)}
    init {
        for (n in 0..2) {
            for (i in 0..2) {
                history[n][i] = 1
            }
        }
    }
    private val random = Random(seed)

    private fun getSum (hv: Int) : Int {
        var sum = 0
        for (i in 0..2) sum += history[hv][i]
        return sum
    }

    /**
     * history[0][0] グー、グーと自分が出した時の過去の勝ち数
     * history[0][1] グー、チョキと自分が出した時の過去の勝ち数
     * history[0][2] グー、パーと自分が出した時の過去の勝ち数
     * 例：
     * 前回自分がグーを出したとする。getSumでhistory[0][0],history[0][1],history[0][2]の値を足した値で乱数を生成。
     * それぞれの値が3, 5, 7だとすると、nextHandでは次の流れになる。
     *
     * グー、チョキ、パーを出す割合を3:5:7とする。
     * 乱数が0以上3未満ならグー、3以上8(3 + 5)未満ならチョキ、8以上15(3 + 5 + 7)未満ならパー
     */
    override fun nextHand() : Hand {
        val bet = random.nextInt(getSum(currentHandValue))
        val handValue = when {
            (bet < history[currentHandValue][0]) -> 0
            (bet < history[currentHandValue][0] + history[currentHandValue][1]) -> 1
            else -> 2
        }
        prevHandValue = currentHandValue
        currentHandValue = handValue
        return Hand.getHand(handValue)
    }

    override fun study(win: Boolean) {
        if (win) {
            history[prevHandValue][currentHandValue]++ // 過去の勝ち数を積み上げる
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++ // 今回自分が出した手以外の勝ち数をそれぞれ積み上げる
            history[prevHandValue][(currentHandValue + 2) % 3]++
        }
    }
}
