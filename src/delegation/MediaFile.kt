package delegation

class MediaFile(
    private val downloader: Downloader,
    private val player: Player
) : Downloader by downloader, Player by player

// {
//
//    override fun download() {
//        downloader.download()
//    }
//
//    override fun play() {
//        player.play()
//    }
//}
