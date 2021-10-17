package visitor

import composite.FileTreatmentException

abstract class Entry: Element {
    // ELementのacceptはEntryのサブクラスであるFileクラスやDirectoryクラス
    abstract fun getSize(): Int
    open fun add(entry: Entry): Entry { // Directoryクラスだけ有効のため、エラーを設定。以下同様
        throw FileTreatmentException()
    }
    open fun iterator(): Iterator<Entry> {
        throw FileTreatmentException()
    }
}
