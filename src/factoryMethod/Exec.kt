package factoryMethod

import factoryMethod.framework.Factory
import factoryMethod.idcard.IDCardFactory

class Exec {
    fun exc() {
        val factory: Factory = IDCardFactory()
        val p1 = factory.create("ホゲホゲお")
        val p2 = factory.create("ふがふが個")
        p1.use()
        p2.use()

    }
}