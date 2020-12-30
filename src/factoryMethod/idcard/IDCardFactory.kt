package factoryMethod.idcard

import factoryMethod.framework.Factory
import factoryMethod.framework.Product

class IDCardFactory : Factory() {

    private var owners: MutableMap<String, String>? = null

    override fun createProduct(owner: String): Product {
        return IDCard(owner)
    }

    override fun registerProduct(product: Product) {
        val idCard = product as IDCard
        owners?.put(idCard.owner, idCard.getId())
    }

    fun getOwners() : MutableMap<String, String>? {
        return owners
    }
}