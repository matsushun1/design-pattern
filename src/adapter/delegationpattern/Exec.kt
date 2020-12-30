package adapter.delegationpattern

class Exec {
    fun exec() {
        val dfd1 = DfdVer1()
        // Defendクラス内で定義されたメソッドの処理は、事実上DfdVer1に移譲している
        Defend(dfd1).beInvincible()
        Defend(dfd1).beTransparent()

        val pp = Properties()
        val fp = FileProperties(pp)
        fp.sayHello()

    }
}