package com.example.egidijusgecius.refactoringpractice;

public class MakeClassStatic {

    private final String outerClassId = "innerClassId";

    class OuterClass {

        private final String innerClassId = "inner_class_id";
        private final String externalId = outerClassId;

    }

}
