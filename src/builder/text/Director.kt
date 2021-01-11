package builder.text

/**
 * Builderの作成過程を定義する
 * 実際はBuilderクラスのサブクラスが渡ってくる
 * (Builder自身は抽象クラスのためインスタンスが作れない）
 */
class Director(private val builder: Builder) {
    fun construct() {
        builder.makeTitle(Message.TITLE.string)
        builder.makeString("朝から昼にかけて")
        builder.makeItems(mutableListOf(Message.GOOD_MORNING.string, Message.GOOD_AFTERNOON.string))
        builder.makeString("夜に")
        builder.makeItems(mutableListOf(Message.GOOD_EVENING.string, Message.GOOD_NIGHT.string, Message.GOOD_BYE.string))
        builder.close() // 文書を完成させる
    }
}

enum class Message(val string: String) {
    TITLE("Greeting"),
    GOOD_MORNING("おはようございます。"),
    GOOD_AFTERNOON("こんにちは。"),
    GOOD_EVENING("こんばんは。"),
    GOOD_NIGHT("おやすみなさい。"),
    GOOD_BYE("さようなら。")
}
