package com.example.egidijusgecius.refactoringpractice;

public class ReplaceConstructorWithFactoryMethod {

    public class Class {
        public Class(String s) {
        }
    }

    public class AnotherClass {
        public void method() {
            Class aClass = new Class("string");
        }
    }
}
