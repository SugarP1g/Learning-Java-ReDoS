package com.zch.fix;

import java.util.regex.Pattern;

public class Demo1 {

    public static void main(String[] args) {
        String regex = "(a+)+";
        String value = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaz";
        Pattern pattern = Pattern.compile(regex);
        boolean flag = pattern.matcher(new MatcherInput(value, new AccessCount())).find();
        System.out.println(flag);
    }
}
