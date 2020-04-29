package com.example.presentation.display.name;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test class name")
class NamingTest {

    @DisplayName("First test method")
    @Test
    void firstTestMethod() {
        System.out.println("First test method");
    }

    @DisplayName("Second test method")
    @Test
    void secondTestMethod() {
        System.out.println("Second test method");
    }
}
