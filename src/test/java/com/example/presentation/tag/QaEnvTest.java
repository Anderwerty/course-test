package com.example.presentation.tag;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("qa")
class QaEnvTest {

    @Test
    void qaEnvTest(){
        System.out.println("Run tests on qa env");
    }
}
