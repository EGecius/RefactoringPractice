package com.example.egidijusgecius.refactoringpractice;

public class ExtractDelegate {

    public class Foo {
        private String b;

        public String getInfo() {
            return ("(" + b + ")");
        }
    }

    public class Bar {
        Foo foo;
        String t2 = foo.getInfo();
    }
}
