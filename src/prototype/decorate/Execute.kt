package prototype.decorate

import prototype.framework.Manager

class Execute {
    fun execute() {
        val manager = Manager()
        val upen = UnderlinePen('~')
        val mbox = MessageBox('*')
        val sbox = MessageBox('/')
        manager.register("strong message", upen)
        manager.register("warning box", mbox)
        manager.register("slash box", sbox)

        // インスタンスの複製を行う
        // 引数にクラス名は指定しないことで、クラスへの依存を減らしている
        val p1 = manager.create("strong message")
        val p2 = manager.create("warning box")
        val p3 = manager.create("slash box")

        p1.use("Hello, world")
        p2.use("Hello, world")
        p3.use("Hello, world")
    }
}
