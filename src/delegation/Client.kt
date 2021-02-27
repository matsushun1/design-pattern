package delegation

class Client {
    fun execute() {
        val file = "File1.mkv"
        val mediaFile = MediaFile(FileDownloader(file), FilePlayer(file))
        mediaFile.download()
        mediaFile.play()
    }
}
