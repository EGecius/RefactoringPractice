package com.example.egidijusgecius.refactoringpractice;

public class ExtractMethodObject {

    class Account {
        /* In the editor, select the method code block to be extracted into the object. */
        int gamma(int val1, int val2) {
            //some computations
            int c = val2 * 2;
            int a = val1 * 2;


            return c - 2 * a;
        }
    }
}
