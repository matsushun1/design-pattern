package bridge

class RandomDisplay(impl: DisplayImpl): Display(impl) {
    fun randomDisplay (times: Int) {
        open()
        for (i in 0..(0..times).random()) {
            print()
        }
        close()
    }

}
