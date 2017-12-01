package com.example.egidijusgecius.refactoringpractice;

public class PushMembersDown {

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
