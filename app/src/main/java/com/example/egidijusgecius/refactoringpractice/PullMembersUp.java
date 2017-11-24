package com.example.egidijusgecius.refactoringpractice;

public class PullMembersUp {

    public class Class extends SuperClass {

        @Override
        void publicMethod() {
        }

        void hiddenMethod() {
        }

    }

    class SuperClass {
        void publicMethod() {
        }
    }
}