package com.example.calculator;

public class Example {
    public String method(String key) {

        return getGetenv(key);
    }

    protected String getGetenv(String key) {
        return System.getenv(key);
    }
}
