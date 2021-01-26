package abstractFactory.listFactory

import abstractFactory.factory.Link

class ListLink(private val url: String, caption: String) : Link(url, caption) {
    // Link抽象クラスでは実装しなかったが、Linkが継承するItemクラスにはmakeHTMLメソッドが定義されているため、overrideする
    override fun makeHTML(): String {
        return "    <li><a href=\"$url\">$caption</a></li>\n"
    }
}
