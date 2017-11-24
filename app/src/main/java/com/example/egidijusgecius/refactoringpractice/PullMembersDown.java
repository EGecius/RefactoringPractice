package com.example.egidijusgecius.refactoringpractice;

public class PullMembersDown {

    public class Class extends SuperClass {
        @Override
        public void publicMethod() {
        }
    }

    public abstract class SuperClass {
        public abstract void publicMethod();

        public void hiddenMethod() {
        }
    }
}
