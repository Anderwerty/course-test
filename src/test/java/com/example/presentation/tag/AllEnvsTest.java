package com.example.presentation.tag;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

@Tags({
        @Tag("dev"),
        @Tag("qa"),
        @Tag("preprod")
})
class AllEnvsTest {
    @Test
    void allEnvsTest() {
        System.out.println("run tests for all envs");
    }
}
