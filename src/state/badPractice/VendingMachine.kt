package state.badPractice

import state.VendingMachineController

class VendingMachine(private val controller: VendingMachineController) {

    // enumの代わり
    private val locked = 0
    private val unlocked = 1

    private val money = 0
    private val alien = 1

    var alarmCalled = false

    var state = locked

    /**
     * 状態が増えるにつれて可読性とメンテナンス性が落ちる
     */
    fun event(event: Int) {
        when (state) {
            locked -> {
                when (event) {
                    money -> {
                        state = unlocked
                        controller.unlock()
                    }
                    alien -> {
                        controller.alarm() // 実装クラスでtrueを返す
                    }
                }
            }
            unlocked -> {
                when (event) {
                    money -> {
                        controller.provideDrink()
                    }
                    alien -> {
                        controller.lock()
                    }
                }
            }
        }
    }
}