package com.example.egidijusgecius.refactoringpractice;

public class EncapsulateFields {

    public class Class {
        public String string;
    }

    public class AnotherClass {
        public Class aClass;

        public void method() {
            aClass.string = "string";
        }
    }

}
