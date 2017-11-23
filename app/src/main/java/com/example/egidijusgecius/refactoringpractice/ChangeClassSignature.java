package com.example.egidijusgecius.refactoringpractice;

public class ChangeClassSignature {

    public class MyClass {
        // some code here
    }

    public class MyOtherClass {

        // Here are the references to MyClass:

        MyClass myClass;
        void myMethod(MyClass myClass) {
            // some code here
        }
        // some code here
    }
}
