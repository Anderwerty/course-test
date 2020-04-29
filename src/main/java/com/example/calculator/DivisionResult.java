package com.example.calculator;

public class DivisionResult {
    private final int result;
    private final int remain;

    public DivisionResult(int result, int remain) {
        this.result = result;
        this.remain = remain;
    }

    public int getResult() {
        return result;
    }

    public int getRemain() {
        return remain;
    }

}
