package state.goodPractice.state

import state.goodPractice.VendingMachine

interface VendingMachineState {
    fun money(vendingMachine: VendingMachine)
    fun alien(vendingMachine: VendingMachine)
}