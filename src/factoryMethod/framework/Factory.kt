package factoryMethod.framework

/**
 * createでProductのインスタンスを生成するクラス
 */
abstract class Factory {
    /**
     * Template Methodを用いる。
     * インスタンス生成（実質的なコンストラクタ）
     */
    fun create(owner: String) : Product {
        val p = createProduct(owner)
        registerProduct(p)
        return p
    }
    abstract fun createProduct(owner: String): Product
    abstract fun registerProduct(product: Product)
}