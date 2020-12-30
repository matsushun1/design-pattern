package factoryMethod.idcard

import factoryMethod.framework.Product
import java.util.*

data class IDCard(val owner: String) : Product() {

    private var id: String = ""

    init {
        this.id = UUID.randomUUID().toString()
        println("${this.owner}のカードを作ります。番号は${this.id}です。")
    }
    override fun use() {
        println("${this.owner}のカードを使います。")
        println("番号は${this.id}です。")
    }

    fun getId(): String {
        return this.id
    }

}