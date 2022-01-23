package state.goodPractice.state

import state.goodPractice.VendingMachine

// 複数の状態を作る必要がないため、シングルトン
object LockedVendingMachineState : VendingMachineState {

    override fun money(vendingMachine: VendingMachine) {
        vendingMachine.setUnlocked() // 状態を持つvendingMachineを透過的に利用できている
        vendingMachine.unlock()
    }
    override fun alien(vendingMachine: VendingMachine) {
        vendingMachine.alarm()
    }
}