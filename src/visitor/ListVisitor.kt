package visitor

/**
 * データ構造を渡り歩きながら一覧を表示するクラス
 */
class ListVisitor: Visitor {
    private var currentDir = ""
    // Fileを訪問した時にFileクラスのacceptから呼び出される
    override fun visit(file: File) {
        println("${currentDir}/$file")
    }

    // Directoryを訪問した時にDirectoryクラスのacceptから呼び出される
    override fun visit(directory: Directory) {
        println("${currentDir}/$directory")
        val saveDir = currentDir
        currentDir = "${currentDir}/${directory.name}"
        val it = directory.iterator()
        while (it.hasNext()) {
            val entry = it.next()
            println("dir entry: $entry")
            entry.accept(this)
        }
        currentDir = saveDir
    }
}
