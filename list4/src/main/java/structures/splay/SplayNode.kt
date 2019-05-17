package structures.splay

data class BSTNode<T : Comparable<T>>(
    var key : T?,
    var left : BSTNode<T>? = null,
    var right: BSTNode<T>? = null,
    var parent: BSTNode<T>? = null) {
    override fun toString(): String {
        return "[$key l: $left r: $right]"
    }
}