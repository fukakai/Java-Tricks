package com.dalichamp.romain.java.secrets.enumm;


public enum Person implements Speaker {
    JOE("Joseph") {
        public void speak() { System.out.println("Hi, my name is Joseph"); }
    },
    JIM("James"){
        public void speak() { System.out.println("Hey, i'm James - what's up?"); }
    };
    private final String name;
    private Person(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println("Hi");
    }
}
