package abstractFactory.factory

import java.io.FileWriter
import java.io.IOException

/**
 * 抽象的な製品。HTML全体を抽象的に表現したクラス
 */
abstract class Page(protected val title: String, protected val author: String) {
    protected val content = mutableListOf<Any>()
    fun add(item: Item) { // Item(LinkかTray)を追加する
        content.add(item)
    }
    fun output() { // 簡易的なTemplate Method
        try {
            val fileName = "${title}.html"
            val writer = FileWriter(fileName)
            writer.write(this.makeHTML())
            writer.close()
            println("${fileName}を作成しました。")
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
    abstract fun makeHTML(): String
}
