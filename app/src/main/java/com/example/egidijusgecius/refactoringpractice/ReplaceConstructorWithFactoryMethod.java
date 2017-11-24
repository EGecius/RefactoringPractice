package com.example.egidijusgecius.refactoringpractice;

public class ReplaceConstructorWithFactoryMethod {

    ReplaceConstructorWithFactoryMethod(String String) {
    }

    public class AnotherClass {
        public void method() {
            ReplaceConstructorWithFactoryMethod aClass =
                    new ReplaceConstructorWithFactoryMethod("string");
        }
    }
}
