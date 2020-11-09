package de.smartsquare

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

internal class CountingSetTests {

    @Test
    fun `adding multiple single elements`() {
        val countingSet = CountingSet()

        countingSet.add(1L)
        countingSet.add(2L)
        countingSet.add(2L)

        countingSet.addedElements shouldBeEqualTo 3L
    }

    @Test
    fun `adding multiple elements`() {
        val countingSet = CountingSet()

        countingSet.addAll(setOf(1L, 2L, 3L))

        countingSet.addedElements shouldBeEqualTo 3L
    }
}
