package com.example.presentation.tag;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("preprod")
class PreprodEnvTest {

    @Test
    void preprodEnvTest(){
        System.out.println("Run tests on PreProd env");
    }
}
