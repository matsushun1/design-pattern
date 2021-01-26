package abstractFactory.factory

import java.lang.Exception

abstract class Factory {
    companion object {
        fun getFactory(className: String) : Factory? {
            var factory: Factory? = null
            try {
                // クラス名を動的に読み込んでそのクラスが表すインスタンスを生成する
                factory = Class.forName(className).getDeclaredConstructor().newInstance() as Factory
            } catch (e: Exception) {
                e.printStackTrace()
            }
            return factory
        }
    }
    abstract fun createLink(caption: String, url: String) : Link
    abstract fun createTray(caption: String) : Tray
    abstract fun createPage(title: String, author: String) : Page
}
