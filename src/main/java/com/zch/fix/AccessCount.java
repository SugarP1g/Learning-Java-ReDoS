package com.zch.fix;

public class AccessCount {
    private int count;
    private final int accessThreshold = 1000000;

    public void check() throws IllegalStateException {
        if (this.count++ > accessThreshold) {
            throw new IllegalStateException("Pattern access threshold exceeded");
        }
    }
}
