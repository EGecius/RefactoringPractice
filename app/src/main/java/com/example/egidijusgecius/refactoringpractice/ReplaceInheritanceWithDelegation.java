package com.example.egidijusgecius.refactoringpractice;

public class ReplaceInheritanceWithDelegation {

    public class Class extends SuperClass {
        public int varInt;

        @Override
        public void openMethod() {
            int localVar = varInt;
        }
    }

    public abstract class SuperClass {
        public static final int CONSTANT = 0;

        public abstract void openMethod();

        public void secretMethod() {
        }
    }
}
