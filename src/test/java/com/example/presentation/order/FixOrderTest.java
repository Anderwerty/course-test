package com.example.presentation.order;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FixOrderTest {
    @Order(1)
    @Test
    void firstTestMethod() {
        System.out.println("First test method");
    }

    @Order(2)
    @Test
    void secondTestMethod() {
        System.out.println("Second test method");
    }

    @Order(3)
    @Test
    void thirdTestMethod() {
        System.out.println("Third test method");
    }
}
