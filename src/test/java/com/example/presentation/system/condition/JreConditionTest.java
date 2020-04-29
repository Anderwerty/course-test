package com.example.presentation.system.condition;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

class JreConditionTest {
    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void onJava8() {
        System.out.println("Run this on Java 8");
    }

    @Test
    @EnabledOnJre({JRE.JAVA_8, JRE.JAVA_11})
    void onJava8OrJava11() {
        System.out.println("Run this on Java 8 or Java 11");
    }

    @Test
    @DisabledOnJre(JRE.JAVA_11)
    void notOnJava11() {
        System.out.println("Do not run this on Java 11");
    }
}
