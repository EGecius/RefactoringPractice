package com.example.egidijusgecius.refactoringpractice;

public class ExtractFunctionalParameter {

    @FunctionalInterface
    public interface Person {
        public void sayHello(String s);
    }

    public class Hello {
        private void printHello() {
            String s = "Hello";
            System.out.println(s);
        }

        private void printText() {
            printHello();
        }
    }


    /* AFTER */

//    public class Hello {
//        private void printHello(Person person) {
//            String s = "Hello";
//            person.sayHello(s);
//        }
//
//        private void printText() {
//            printHello(new Person() {
//                public void sayHello(String s) {
//                    System.out.println(s);
//                }
//            });
//        }
//    }
}
