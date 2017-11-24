package com.example.egidijusgecius.refactoringpractice;

public class ExtractDelegate {

    public static class Foo {
        private String b;

        public String getInfo() {
            return ("(" + b + ")");
        }
    }

    public static class Bar {
        Foo foo;
        String t2 = foo.getInfo();
    }
}
