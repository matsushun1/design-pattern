package singleton

class TicketMaker {
    object TicketMaker {
        private var ticket: Int = 1000
        fun getNextTicketNumber(): Int = this.ticket++
    }
}