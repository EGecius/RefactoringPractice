package com.example.egidijusgecius.refactoringpractice;

public class PushMembersDown {

    private Class myClass = new Class();

    void demo() {
        myClass.publicMethod();
    }



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
