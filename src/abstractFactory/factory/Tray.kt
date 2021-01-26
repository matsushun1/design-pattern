package abstractFactory.factory

/**
 * 抽象的な部品。複数のLinkやTrayをまとめるクラス。
 */
abstract class Tray(caption: String) : Item(caption) {
    protected val tray = mutableListOf<Any>()
    fun add(item: Item) {
        tray.add(item)
    }
}
