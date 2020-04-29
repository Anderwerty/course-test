package com.example.presentation.system.condition;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

//https://www.baeldung.com/java-system-get-property-vs-system-getenv
class EnvConditionTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "ENV", matches = "dev")
    void onlyOnStagingServer() {
        System.out.println("This test should run");
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "ENV", matches = "dev")
    void notOnDeveloperWorkstation() {
        System.out.println("This test should not run");
    }
}
