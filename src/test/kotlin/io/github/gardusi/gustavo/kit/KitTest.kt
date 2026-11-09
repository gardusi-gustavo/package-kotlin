package io.github.gardusi.gustavo.kit

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KitTest {
    @Test
    fun greets() {
        assertEquals("Hello, Kotlin", Kit.greet("Kotlin"))
    }

    @Test
    fun chunks() {
        assertEquals(listOf(listOf(1, 2), listOf(3)), Kit.chunk(listOf(1, 2, 3), 2))
    }
}
