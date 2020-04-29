package com.example.calculator;

public interface PropertyProvider {

    String provideProperty(String key);


    default int provideIntProperty(String key) {

        final String propertyValue = provideProperty(key);

        final int intValue = Integer.parseInt(propertyValue);

        return intValue < 0 ? -intValue : intValue;
    }
}
