package com.github.danielamorim

import net.mguenther.kafka.junit.EmbeddedKafkaCluster
import net.mguenther.kafka.junit.EmbeddedKafkaClusterConfig
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ApplicationTest {

    @Test
    fun `should hello() return "Hello, World"`() {
        assert(hello() == "Hello, World!")
    }

    @Test
    fun `should embeddedKafkaCluster different of null`() {
        val embeddedKafkaCluster = EmbeddedKafkaCluster.provisionWith(EmbeddedKafkaClusterConfig.useDefaults())

        assert(embeddedKafkaCluster != null)
    }
}
