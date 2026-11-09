package io.github.gardusi.gustavo.kit

object Kit {
    fun greet(name: String): String = "Hello, $name"

    fun chunk(items: List<Int>, size: Int): List<List<Int>> {
        require(size > 0) { "size must be positive" }
        return items.chunked(size)
    }
}
