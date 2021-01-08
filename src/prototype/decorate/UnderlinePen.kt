package prototype.decorate

import prototype.framework.Product

class UnderlinePen(private val ulChar: Char) : Product(), Cloneable {

    override fun use(str: String) {
        val length = str.toByteArray().size
        println("\"$str\"")
        print(" ")
        for (i in 1..length) {
            print(ulChar)
        }
        println("")
    }
//
//    override fun createClone(): Product {
//        lateinit var p: Product
//        try {
//            p = clone() as Product
//        } catch (e: CloneNotSupportedException) {
//            e.printStackTrace()
//        }
//        return p
//    }
}
