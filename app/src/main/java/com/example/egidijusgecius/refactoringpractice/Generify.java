package com.example.egidijusgecius.refactoringpractice;

import java.util.LinkedList;
import java.util.List;

public class Generify {

    /* BEFORE */

    public void method() {
        List list = new LinkedList();
        list.add("string");
    }

    /* AFTER */

//    public void method() {
//        List<String> list = new LinkedList<String>();
//        list.add("string");
//    }
}
