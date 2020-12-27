package adapter.delegationpattern

/**
 * 実装ずみの既存クラス
 */
class DfdVer1 : DfdVer2 {
    override fun beInvincible() {
        println("${ step() }からの無敵状態")
    }

    override fun beTransparent() {
        println("${ guardByShield() }からの透明状態")
    }

    fun guardByShield(): String {
        return "盾で防御"
    }

    fun step(): String {
        return "回避"
    }
}