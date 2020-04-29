package com.example.presentation.system.condition;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;

import static org.junit.jupiter.api.condition.OS.LINUX;
import static org.junit.jupiter.api.condition.OS.WINDOWS;

class SystemConditionTest {
    @Test
    @EnabledOnOs(WINDOWS)
    void testOnWindows() {
        System.out.println("Run on Windows");
    }


    @Test
    @EnabledOnOs(LINUX)
    void testOnLinux() {
        System.out.println("Run on Linux");
    }

    @Test
    @EnabledOnOs({LINUX, WINDOWS})
    void testOnLinuxAndLinux() {
        System.out.println("Run on Linux and Windows");
    }
}
