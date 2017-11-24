package com.example.egidijusgecius.refactoringpractice;

import java.util.List;

// NOT AVAILABLE IN Android Studio!
public class ExtractFunctionalVariable {

    public class PrintAction implements Runnable {
        private List<String> data;

        public PrintAction(List<String> data) {
            this.data = data;
        }

        public void run() {
            System.out.println("Data: " + data.toString());
        }
    }

    /* AFTER */

//    public class PrintAction implements Runnable {
//        private List<String> data;
//
//        public PrintAction(List<String> data) {
//            this.data = data;
//        }
//
//        public void run() {
//            Function<List<String>, String> presenter = (p) -> "Data: " + p.toString();
//            System.out.println(presenter.apply(data));
//        }
//    }
}
