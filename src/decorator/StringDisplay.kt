package decorator

import common.Constant.DECORATOR.Companion.ROW
import common.Constant.COMMON.Companion.ARRAY_FIRST


class StringDisplay(val string: String): Display() {
    override fun getColumns(): Int = string.toByteArray().size // 文字数

    override fun getRows(): Int = ROW // 行数は毎回1

    override fun getRowText(row: Int): String? {
        return if (row == ARRAY_FIRST) {
            string
        } else {
            null
        }
    }
}
