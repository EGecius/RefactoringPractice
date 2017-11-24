package com.example.egidijusgecius.refactoringpractice;

public class ReplaceTempWithQuery {

    public void method() {
        String str = "str";
        String aString = returnString().concat(str);
        System.out.println(aString);
    }

    private String returnString() {
        return "";
    }

}
