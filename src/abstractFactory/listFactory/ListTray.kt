package abstractFactory.listFactory

import abstractFactory.factory.Item
import abstractFactory.factory.Tray

class ListTray(caption: String) : Tray(caption) {
    override fun makeHTML(): String {
        val buffer = StringBuffer()
        buffer.append("<li>¥n")
        buffer.append("${caption}¥n")
        buffer.append("<ul>¥n")
        // trayに集められたItemをイテレートする
        val it = tray.iterator()
        while (it.hasNext()) {
            // itemの中身がListLinkかListTrayかは判定する必要がない
            val item = it.next() as Item
            buffer.append(item.makeHTML())
        }
        buffer.append("</ul>¥n")
        buffer.append("</li>¥n")
        return buffer.toString()
    }

}
