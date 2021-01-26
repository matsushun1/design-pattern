package abstractFactory.tableFactory

import abstractFactory.factory.Item
import abstractFactory.factory.Tray

class TableTray(caption: String) : Tray(caption) {
    override fun makeHTML(): String {
        val buffer = StringBuffer()
        buffer.append("<td>")
        buffer.append("<table width=\"100%\" border=\"1\"><tr>")
        buffer.append("<td bgcolor=\"#cccccc\" align=\"center=\" colspan=\"" + tray.size + "\"<b>" + caption + "</b></td>")
        buffer.append("</tr>\n")
        buffer.append("<tr>\n")
        tray.forEach {
            val item = it as Item
            buffer.append(item.makeHTML())
        }
        buffer.append("</tr></table>")
        buffer.append("</td>")
        return buffer.toString()
    }
}
