package state.goodPractice

import state.VendingMachineController
import state.goodPractice.state.LockedVendingMachineState
import state.goodPractice.state.UnlockedVendingMachineState
import state.goodPractice.state.VendingMachineState

/**
 * 状態を管理するContextクラス
 */
class VendingMachine(
    private val controller: VendingMachineController // 呼出し元で実装クラスを作る or VendingMachine内で実装する
) {
    private var state: VendingMachineState = LockedVendingMachineState // 依存性逆転

    fun money() {
        state.money(this) // moneyの実行をVendingMachineStateに委譲
    }

    fun alien() {
        state.alien(this) // 委譲 stateのメソッドをby句で表現したかったが、stateがイミュータブルなので断念
    }

    fun setLocked() {
        state = LockedVendingMachineState
    }

    fun setUnlocked() {
        state = LockedVendingMachineState
    }

    fun isLocked(): Boolean {
        return state == LockedVendingMachineState
    }

    fun isUnlocked(): Boolean {
        return state == UnlockedVendingMachineState
    }

    fun provideDrink() {
        controller.provideDrink()
    }

    fun alarm() {
        controller.alarm()
    }

    fun lock() {
        controller.lock()
    }

    fun unlock() {
        controller.unlock()
    }
}