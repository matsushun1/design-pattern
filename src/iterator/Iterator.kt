package iterator

/**
 * 要素を順番にスキャンするAPI役
 */
interface Iterator {
    fun hasNext(): Boolean
    fun next(): Any?
}