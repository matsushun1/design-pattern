package singleton

import java.time.LocalDateTime

class Singleton {
    // kotlinではデフォルトでシングルトンが用意されている
    object Singleton {
        val created = LocalDateTime.now()

        fun write() {
            println("write")
        }

        fun read() {
            println("read")
        }
    }

}