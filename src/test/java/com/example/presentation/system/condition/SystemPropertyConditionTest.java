package com.example.presentation.system.condition;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

//https://mkyong.com/junit5/junit-5-conditional-test-examples/
class SystemPropertyConditionTest {

    @BeforeAll
    static void setProperties() {
        System.setProperty("server.env", "qa");
    }

    @Test
    @EnabledIfSystemProperty(named = "server.env", matches = "qa")
    void onlyOn64BitArchitectures() {
        System.out.println("Test should run");
    }

    @Test
    @DisabledIfSystemProperty(named = "server.env", matches = "qa")
    void notOnCiServer() {
        System.out.println("Test should not run");
    }
}
