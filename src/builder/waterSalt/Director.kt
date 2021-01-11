package builder.waterSalt

class Director(private val builder: Builder) { // サブクラスの実装内容で切り替え可能
    fun construct() {
        builder.addSolute(40.0)
        builder.addSolvent(100.0)
        builder.abandonSolution(70.0)
        builder.addSolvent(100.0)
        builder.addSolute(15.0)
    }
}
