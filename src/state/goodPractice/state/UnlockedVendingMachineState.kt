package state.goodPractice.state

import state.goodPractice.VendingMachine

// シングルトン
object UnlockedVendingMachineState: VendingMachineState {

    override fun money(vendingMachine: VendingMachine) {
        vendingMachine.provideDrink()

    }

    override fun alien(vendingMachine: VendingMachine) {
        vendingMachine.setLocked()
        vendingMachine.lock()
    }
}