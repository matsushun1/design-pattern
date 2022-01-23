package state.badPractice

import state.VendingMachineController
import state.EnumVendingMachineState
import kotlin.test.assertEquals

/**
 * Bad Practiceの実行
 */
class TestVendingMachine {

    fun testMoneyInUnlockedState() {
        val machine = VendingMachine(VendingMachineController())
        machine.state = EnumVendingMachineState.UNLOCKED.ordinal
        machine.event(EnumVendingMachineState.MONEY.ordinal)
        assertEquals(EnumVendingMachineState.LOCKED.ordinal, machine.state)
        assert(machine.alarmCalled)
    }

}