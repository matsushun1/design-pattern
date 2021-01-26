package abstractFactory.factory

/**
 * 抽象的な部品。HTMLのハイパーリンクを抽象的に表現するクラス
 */
abstract class Link(caption: String, url: String) : Item(caption) {

}
