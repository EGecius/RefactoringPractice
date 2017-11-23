package com.example.egidijusgecius.refactoringpractice;

public class ConvertAnonymousToInner {

    public class Class {
        public Interface method() {
            final int i = 0;
            return new Interface() {
                public int publicMethod() {
                    return i;
                }
            };
        }
    }

    interface Interface {
    }
}
