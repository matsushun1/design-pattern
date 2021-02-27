package delegation

class FilePlayer(private val file: String): Player {
    override fun play() {
        println("$file Playing")
    }
}
