package com.example.egidijusgecius.refactoringpractice;

public class UseInterfaceWherePossible {

    public class Class implements Interface {
        public void publicMethod() {
        }

        public void hiddenMethod() {
        }
    }

    public interface Interface {
        int CONSTANT = 0;

        void publicMethod();
    }

    public class AnotherClass {
        Class firstClass;
        Class secondClass;

        public void method() {
            firstClass.publicMethod();
            firstClass.hiddenMethod();
            secondClass.publicMethod();
            if (secondClass instanceof Class) {
            }
        }
    }
}
