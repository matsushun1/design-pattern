package bridge

class RandomDisplay(private val impl: DisplayImpl): Display(impl) {
    fun randomDisplay (times: Int) {
        impl.rawOpen()
        for (i in 0..(0..times).random()) {
            impl.rawPrint()
        }
        impl.rawClose()
    }

}
