package com.example.egidijusgecius.refactoringpractice;

public class RemoveMiddleman {

    public class Foo {
        Bar bar;
        public Foo getImpValue() {
            return bar.getImpValue();
        }
    }

    public class Bar {
        private Foo impValue1;
        public Bar(Foo impValue) {
            impValue1 = impValue;
        }
        public Foo getImpValue() {
            return impValue1;
        }
    }

    public class Client {
        Foo a;
        Foo impValue = a.getImpValue();
    }
}
