package iterator

/**
 * 集合体に対応するIteratorを１個作成するためのもの。
 * 集合体を集計・スキャン・1つずつ調べたい際にはiteratorメソッドを使って
 * Iteratorインターフェースを実装したクラスのインスタンスを作る
 * 1つのクラスで複数のiterateメソッドが実現できる
 */
interface Aggregate {
    fun iterator(): Iterator
}