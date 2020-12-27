package adapter.extendpattern

class PrintBanner(string: String) : Print, Banner(string) {
    override fun printWeak() {
        showWithAster()
    }

    override fun printStrong() {
        showWithParen()
    }
}