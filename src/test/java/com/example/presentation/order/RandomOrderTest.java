package com.example.presentation.order;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Random.class)
class RandomOrderTest {
    @Test
    void firstTestMethod() {
        System.out.println("First test method");
    }

    @Test
    void secondTestMethod() {
        System.out.println("Second test method");
    }

    @Test
    void thirdTestMethod() {
        System.out.println("Third test method");
    }
}
