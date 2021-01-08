package prototype.framework

/**
 * Kotlinの場合インターフェースにCloneableは実装できない
 */
abstract class Product : Cloneable {
    abstract fun use(str: String)
    fun createClone() : Product {
        lateinit var p: Product
        try {
            p = clone() as Product
        } catch (e: CloneNotSupportedException) {
            e.printStackTrace()
        }
        return p
    }
}
