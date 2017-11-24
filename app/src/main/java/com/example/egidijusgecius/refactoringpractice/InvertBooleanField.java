package com.example.egidijusgecius.refactoringpractice;

public class InvertBooleanField {

    boolean b = true;
//...
    public void method() {
//    ...
        b = false;
//    ...
    }


    /* AFTER */

//    boolean b = false;
//
//    public void method() {
//        b = true;
//    }

}
