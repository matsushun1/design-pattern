package highOrderFunction

class HighOrderFunction {

    fun execute() {
        val members = listOf("Tom", "Jerry", "Bob", "Olibia")
        val numbers = listOf(1, 3, 5, 7)

//    readList(members) { member -> println(member) }
//    readList(numbers, ::println)
//        val result = readLastStr(members, "hoge") { str ->
//            getLastStr(str)
//        }
        val resultList = getLastStrOfElement(members) {
            getLastStr(it)
        }
//
//        println("readLastStrの結果は${result}")
//        println("getLastStrOfElementの結果は")
//        resultList.forEach { print(it) }
        val minStrResult = min(members) { a, b -> a.length > b.length }
        val minIntResult = min(numbers) { a, b -> a > b }
        println(minStrResult)
        println(minIntResult)

    }

    private fun <A>readList(members: List<A>, someFunction: (A) -> Unit) {
        for(person in members) {
            someFunction(person)
        }
    }

    private fun getLastStr(string: String) : String {
        return string.takeLast(1)
    }

    private fun <T>readLastStr(members: List<T>, param: T, printFunction: (T) -> T) : T {
        return printFunction(param)
    }

    private fun <T>getLastStrOfElement(members: List<T>, getParamFunction: (T) -> T) : List<T> {
        val res = mutableListOf<T>()
        members.forEach { res.add(getParamFunction(it)) }
        return res
    }

    // 無名関数
    private fun <T>min(collection: Collection<T>, more: (T, T) -> Boolean): T? {
        var min: T? = null
        for (it in collection) {
            if (min == null || more(min, it)) {
                min = it
            }
        }
        return min
    }
}
