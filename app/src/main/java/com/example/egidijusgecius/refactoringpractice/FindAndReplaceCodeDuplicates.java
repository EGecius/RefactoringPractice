package com.example.egidijusgecius.refactoringpractice;

public class FindAndReplaceCodeDuplicates {

//   you can replace:
//    1) CONSTANT
//    2) method add()

    private static final int CONSTANT = 1;

    public void method() {
        int a = CONSTANT;
        int b = 1;
        int c = a + b;
        int d = b + c;
    }

    private int add(int a, int b) {
        return a + b;
    }
}
