package singleton

class SingletonExec {
    fun exec() {
//        println("現在は、${Singleton.Singleton.created}です。")
//        Singleton.Singleton.read()
//        Singleton.Singleton.write()
        println(TicketMaker.TicketMaker.getNextTicketNumber())
        println(TicketMaker.TicketMaker.getNextTicketNumber())
        println(TicketMaker.TicketMaker.getNextTicketNumber())
    }
}