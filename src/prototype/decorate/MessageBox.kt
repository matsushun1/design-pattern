package prototype.decorate

import prototype.framework.Product

class MessageBox(private val decoChar: Char) : Product(), Cloneable {

    override fun use(str: String) {
        val length = str.toByteArray().size
        for (i in 1..length + 4) {
            print(decoChar)
        }
        println("")
        println("$decoChar $str $decoChar")
        for (i in 1..length + 4) {
            print(decoChar)
        }
        println("")
    }

//    override fun createClone() : Product {
//        lateinit var p: Product
//        try {
//            p = clone() as Product // clone()はCloneableインターフェースを実装している場合に限る
//        } catch (e: CloneNotSupportedException) {
//            e.printStackTrace()
//        }
//        return p
//    }
}
