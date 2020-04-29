package com.example.calculator;

public class DivisionCalculator {
    private final DivisionValidator validator;
    private final DivisionProvider divisionProvider;
    private final DivisionViewFormatter formatter;

    public DivisionCalculator(DivisionValidator validator,
                              DivisionProvider divisionProvider,
                              DivisionViewFormatter formatter) {
        this.validator = validator;
        this.divisionProvider = divisionProvider;
        this.formatter = formatter;
    }

    public String calculate(int division, int divisor) {
        validator.validate(divisor);

        final DivisionResult divisionResult = divisionProvider.provideDivision(division, divisor);

        return formatter.format(divisionResult);
    }
}
