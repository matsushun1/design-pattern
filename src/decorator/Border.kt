package decorator

/**
 * 飾り枠を表す抽象クラス
 * フィールドにDisplayクラスを持つことで飾り枠の中に飾り枠を作成することが可能になる
 */
abstract class Border(val display: Display): Display() {

}
