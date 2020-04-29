package com.example.presentation.tag;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("dev")
class DevEnvTest {

    @Test
    void devEnvTest(){
        System.out.println("Run tests for dev envs");
    }

}
