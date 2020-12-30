package adapter.delegationpattern

import java.io.InputStream
import java.io.OutputStream

class Properties() : FileIO {

    private lateinit var mutableMap: MutableMap<String, String>

    fun load(inputStream: InputStream) {

    }

    fun store(outputStream: OutputStream, header: String) {

    }

    fun setProperty(key: String, value: String) {

    }

    override fun readFromFile(fileName: String) {
        TODO("Not yet implemented")
    }

    override fun writeToFile(fileName: String) {
        TODO("Not yet implemented")
    }

    override fun setValue(key: String, value: String) {
        TODO("Not yet implemented")
    }

    override fun getValue(key: String): String {
        TODO("Not yet implemented")
    }
}