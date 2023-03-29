package com.zch.fix;

public class MatcherInput implements CharSequence {

    private final CharSequence value;

    private final AccessCount access;

    public MatcherInput(CharSequence value, AccessCount access) {
        this.value = value;
        this.access = access;
    }

    public char charAt(int index) {
        this.access.check();
        return this.value.charAt(index);
    }

    public CharSequence subSequence(int start, int end) {
        return new MatcherInput(this.value.subSequence(start, end), this.access);
    }

    public int length() {
        return this.value.length();
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
