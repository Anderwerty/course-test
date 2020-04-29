package com.example.presentation.assertions;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    @Test
//    @Disabled
    void assertWithAssertEquals() {
        final User actual = new User("Alex", "Petrov", 23);
        final User expected = new User("Alex", "Petrov", 24);

        assertEquals(actual, expected);

    }
}
