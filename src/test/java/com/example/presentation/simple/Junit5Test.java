package com.example.presentation.simple;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Junit5Test {

    @Test
    void theAnswer() {
        assertEquals(42, 22 + 20);
    }


    @Test
    @DisplayName("Not exception should be thrown")
    void validatorShouldNotThrowException() {
        Integer result = assertDoesNotThrow(() ->
                ThreadLocalRandom.current().nextInt(100));
        assertTrue(result < 100);
    }

    @Test
    @DisplayName("Provide all checks")
    void provideAllChecks() {
        assertAll(
                () -> assertTrue(true, ""),
                () -> assertNull(null),
                () -> assertEquals("42", "4" + "2"),
                () -> assertTimeout(ofSeconds(1), () -> 42 * 42)
        );
    }
}
