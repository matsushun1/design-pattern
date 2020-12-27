package adapter.extendpattern

open class Banner(private val string: String) {
    fun showWithParen() {
        println("($string)")
    }

    fun showWithAster() {
        println("*$string*")
    }
}