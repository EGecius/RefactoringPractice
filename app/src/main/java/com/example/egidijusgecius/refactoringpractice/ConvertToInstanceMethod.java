package com.example.egidijusgecius.refactoringpractice;

public class ConvertToInstanceMethod {

    ClassA classA = new ClassA();
    ClassB classB = new ClassB();

    static public void greatMethod(ClassA classA, ClassB classB) {
        System.out.println("classA = " + classA);
        System.out.println("classB = " + classB);
    }

    public void myMethod() {
        MyClass.greatMethod(classA, classB);
    }

    private class ClassA {
    }

    private class ClassB {
    }

    static class MyClass {

        private static void greatMethod(ClassA classA, ClassB classB) {

        }
    }
}
