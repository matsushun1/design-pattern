package builder.text

class BuilderExec {
    fun execute(str: String) {
        if(str == "plain") {
            val textBuilder = TextBuilder()
            // directorはサブクラスの内容を知らない
            // サブクラスをBuilderとしてコンストラクタに渡すことで、交換可能性を呼ぶ
            val director = Director(textBuilder)
            director.construct()
            val result = textBuilder.getResult()
            println(result)
        }

        if(str == "html") {
            val htmlBuilder = HTMLBuilder()
            val director = Director(htmlBuilder)
            director.construct()
            val fileName = htmlBuilder.getResult()
            println("${fileName}が作成されました。")
        }
    }
}
