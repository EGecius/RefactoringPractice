package com.example.egidijusgecius.refactoringpractice;

public class TypeMigration {

    int f;

    void bar(int i) {
    }

    void foo() {
        bar(f);
    }

    interface Interface<T> {
        T foo(T t);
    }

    class ConcreteClass implements Interface<String> {
        String myString;

        public String foo(final String s) {
            if (s == null) {
                return myString;
            }
            return s;
        }
    }
}
