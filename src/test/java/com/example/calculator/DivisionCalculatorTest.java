package com.example.calculator;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class DivisionCalculatorTest {


    @Mock
    private DivisionValidator validator;

    @Mock
    private DivisionProvider divisionProvider;

    @Spy
    private DivisionViewFormatter formatter;


    public void method(){
        when(formatter.format(any())).thenReturn(null);

        doReturn(null).when(formatter).format(null);
    }

}