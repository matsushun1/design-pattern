package visitor

import composite.FileTreatmentException

class Execute {
    fun exec() {
        println("Making root entries")
        try {
            val rootDir = Directory("root")
            val binDir = Directory("bin")
            val tmpDir = Directory("tmp")
            val usrDir = Directory("usr")
            rootDir.add(binDir)
            rootDir.add(tmpDir)
            rootDir.add(usrDir)
            binDir.add(File("vi", 10000))
            binDir.add(File("latex", 20000))
            rootDir.accept(ListVisitor())

            println("")
            println("Making user entries")
            val yumi = Directory("yumi")
            val kano = Directory("kano")
            val kana = Directory("kana")
            usrDir.add(yumi)
            usrDir.add(kano)
            usrDir.add(kana)
            yumi.add(File("diary.html", 100))
            kano.add(File("Auth.kt", 200))
            kana.add(File("hog.doc", 400))
            rootDir.accept(ListVisitor())
        } catch (e: FileTreatmentException) {
            e.printStackTrace()
        }
    }
}
