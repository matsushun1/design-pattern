package delegation

class FileDownloader(private val file: String): Downloader {
    override fun download() {
        println("$file Downloaded")
    }
}
