package prototype.framework

/**
 * インスタンスの複製を行うクラス
 */
class Manager {
    private var showcase: MutableMap<String, Product> = mutableMapOf()
    fun register(name: String, proto: Product) {
        showcase[name] = proto
    }
    fun create(protoName: String) : Product {
        val p  = showcase[protoName] as Product
        return p.createClone()
    }
}
