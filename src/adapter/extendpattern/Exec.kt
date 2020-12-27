package adapter.extendpattern

class Exec {
    fun execute() {
        // あくまでPrintインターフェースとして実行
        // PrintBannerがどのように実現されているかをMainクラスは知らない
        val p: Print = PrintBanner("Hello")
        p.printWeak()
        p.printStrong()

        val atk: AtkVer2 = Attack()
        println(atk.swing())
        println(atk.shoot())
    }
}