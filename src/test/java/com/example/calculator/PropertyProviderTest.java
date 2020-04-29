package com.example.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Answers;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PropertyProviderTest {

    @Mock(answer = Answers.CALLS_REAL_METHODS)
    private PropertyProvider propertyProvider;

    @Test
    void shouldReturnIntProperty1() {
        when(propertyProvider.provideProperty("key")).thenReturn("1");

        final int value = propertyProvider.provideIntProperty("key");

        assertEquals(value, 1);
    }

    @Test
    void shouldReturnIntProperty2() {
        when(propertyProvider.provideProperty("key")).thenReturn("-1");

        final int value = propertyProvider.provideIntProperty("key");

        assertEquals(value, 1);
    }

}