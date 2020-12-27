package adapter.extendpattern

/**
 * 旧仕様のAtkVer1と新仕様のAtkVer2とを結合させる
 * 旧仕様のクラスを継承して新規メソッドを追加するだけだと、前者が変更された際の影響度が強くなる
 * メソッドの内容は呼び出した際に定義するのが継承バージョン
 */
class Attack : AtkVer1(), AtkVer2 {
    override fun shoot(): String {
        return "shoot" + rash()
    }

    override fun swing(): String {
        return "swing" + rash()
    }
}