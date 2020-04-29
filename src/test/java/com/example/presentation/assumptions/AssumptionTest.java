package com.example.presentation.assumptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

class AssumptionTest {

    @Test
    void methodTest1() {
        assumeTrue(1 == 2);
        System.out.println("test");
    }

    @Test
    void methodTest2() {
        assumingThat(1 == 1, () ->
                assertEquals(1 + 1, 2)
        );
        System.out.println("test");
    }
}
