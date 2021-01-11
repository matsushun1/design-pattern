package builder.text

import java.io.FileWriter
import java.io.IOException
import java.io.PrintWriter

class HTMLBuilder : Builder() {
    private lateinit var fileName: String
    private lateinit var writer: PrintWriter
    override fun makeTitle(title: String) {
        fileName = "$title.html"
        try {
            writer = PrintWriter(FileWriter(fileName))
        } catch (e: IOException) {
            e.printStackTrace()
        }
        writer.println("<html><head><title>$title</title></head><body>")
        // タイトルを出力
        writer.println("<h1>$title</h1>")
    }

    override fun makeString(str: String) {
        writer.println("<p>$str</p>")
    }

    override fun makeItems(items: MutableList<String>) {
        writer.println("<ul>")
        items.forEach { writer.println("<li>$it</li>") }
        writer.println("</ul>")
    }

    override fun close() {
        writer.println("</body></html>")
        writer.close()
    }

    fun getResult() : String {
        return fileName
    }

}
