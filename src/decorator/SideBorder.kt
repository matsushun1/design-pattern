package decorator

import common.Constant.DECORATOR.Companion.SIDE_BORDER_LENGTH

class SideBorder(display: Display, private val borderChar: Char): Border(display) {
    override fun getColumns(): Int = SIDE_BORDER_LENGTH + display.getColumns() + SIDE_BORDER_LENGTH

    override fun getRows(): Int = display.getRows() // 上下には飾り枠を設けない

    override fun getRowText(row: Int): String? {
        return borderChar.toString() + display.getRowText(row) + borderChar.toString()
    }
}
