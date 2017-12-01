package com.example.egidijusgecius.refactoringpractice;

public class RemoveMiddleman {

    public class Foo {
        Middleman middleman;

        public Foo getFoo() {
            return middleman.getFoo();
        }
    }

    public class Middleman {
        private Foo foo;

        public Middleman(Foo foo) {
            this.foo = foo;
        }

        public Foo getFoo() {
            return foo;
        }
    }

    public class Client {
        Foo a;
        Foo foo2 = a.getFoo();
    }
}
