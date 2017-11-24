package com.example.egidijusgecius.refactoringpractice;

public class InvertBooleanMethod {

    private double a;

    public boolean method() {
        if (a > 15 && a < 100) {
            a = 5;
            return true;
        }
        return false;
    }

    /* AFTER */

//    private double a;
//
//    public boolean method() {
//        if (a > 15 && a < 100) {
//            a = 5;
//            return false;
//        }
//        return true;
//    }
}
