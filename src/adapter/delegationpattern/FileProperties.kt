package adapter.delegationpattern

class FileProperties(
   private val properties: Properties
) : FileIO by properties {
    fun sayHello() {
        println("Hello")
    }
}