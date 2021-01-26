package abstractFactory.factory

import kotlin.system.exitProcess

class AbstractFactoryMain {
    fun execute(string: String) {
        if(string.length != 1) {
            println("Usage: Kotlin Main class.name.of.ConcreteFactory")
            println("Example 1: Kotlin Main listfactory.ListFactory")
            println("Example 2: Kotlin Main tablefactory.TableFactory")
            exitProcess(0)
        }
        val factory: Factory? = Factory.getFactory(string)

        val asahi = factory?.createLink("朝日新聞", "https://www.asahi.com")
        val yomiuri = factory?.createLink("読売新聞", "https://www.yomiuri.co.jp/")

        val usYahoo = factory?.createLink("Yahoo!", "https://yahoo.com/")
        val jpYahoo = factory?.createLink("Yahoo!Japan", "https://yahoo.co.jp/")

        val excite = factory?.createLink("Excite", "https://www.excite.com/")
        val google = factory?.createLink("Google", "https://google.com")

        val traynews = factory?.createTray("新聞")
        traynews?.add(asahi as Item)
        traynews?.add(yomiuri as Item)

        val trayyahoo = factory?.createTray("Yahoo!")
        trayyahoo?.add(usYahoo as Item)
        trayyahoo?.add(jpYahoo as Item)

        val traysearch = factory?.createTray("サーチエンジン")
        traysearch?.add(trayyahoo as Item)
        traysearch?.add(excite as Item)
        traysearch?.add(google as Item)

        val page = factory?.createPage("LinkPage", "山田太郎")
        page?.add(traynews as Item)
        page?.add(traysearch as Item)
        page?.output()
    }
}
