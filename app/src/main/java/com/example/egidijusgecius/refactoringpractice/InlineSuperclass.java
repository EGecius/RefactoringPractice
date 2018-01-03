package com.example.egidijusgecius.refactoringpractice;

public class InlineSuperclass {

    public class Child extends Parent {

        @Override
        public void childMethod() {
        }
    }

    public abstract class Parent {
        public abstract void childMethod();

        public void parentMethod() {
        }
    }
}
