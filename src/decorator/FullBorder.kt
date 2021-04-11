package decorator

import common.Constant.COMMON.Companion.NONE
import common.Constant.DECORATOR.Companion.ROW
import common.Constant.DECORATOR.Companion.SIDE_BORDER_LENGTH

class FullBorder(display: Display) : Border(display) {
    override fun getColumns(): Int = SIDE_BORDER_LENGTH + display.getColumns() + SIDE_BORDER_LENGTH

    override fun getRows(): Int = ROW + display.getRows() + ROW // 中身の行数に上下の飾り文字分を加えたもの

    override fun getRowText(row: Int): String? {
        println("row: $row : ${display.getRowText(row)} getRows: ${getRows()}")
        return when (row) {
            NONE -> { "+" + makeLine('-', display.getColumns()) + "+" } // 枠の上端
            display.getRows() + ROW -> { "+" + makeLine('-', display.getColumns()) + "+" } // 中身の行 + 1 = 枠の下端
            else -> { "|" + display.getRowText(row - 1) + "|" }
        }
    }

    private fun makeLine(char: Char, count: Int): String {
        val buffer = StringBuffer()
        for (i in 0 until count) {
            buffer.append(char)
        }
        return buffer.toString()
    }
}
