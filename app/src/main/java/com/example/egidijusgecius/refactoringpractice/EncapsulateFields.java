package com.example.egidijusgecius.refactoringpractice;

public class EncapsulateFields {

    public class Class {
        public String aString;
    }

    public class AnotherClass {
        public Class aClass;
        public void method() {
            aClass.aString="string";
        }
    }
}
