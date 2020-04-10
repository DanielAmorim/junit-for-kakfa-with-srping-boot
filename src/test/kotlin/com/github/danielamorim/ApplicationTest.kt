package com.github.danielamorim

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ApplicationTest {
    @Test
    fun `should hello() return "Hello, World"`() {
        assert(hello() == "Hello, World!")
    }
}
