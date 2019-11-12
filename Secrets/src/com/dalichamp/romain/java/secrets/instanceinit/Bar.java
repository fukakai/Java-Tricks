package com.dalichamp.romain.java.secrets.instanceinit;

/**
 * https://dzone.com/articles/5-hidden-secrets-in-java
 *
 *  When a superclass is introduced, the order of execution changes slightly:
 *
 * 1. Static initializers of superclass, in order of their declaration
 * 2. Static initializers of subclass, in order of their declaration
 * 3. Instance initializers of superclass, in order of their declaration
 * 4. Constructor of superclass
 * 5. Instance initializers of subclass, in order of their declaration
 * 6. Constructor of subclass
 *
 * Bar:static 1
 * Bar:static 2
 * Foo:static 1
 * Foo:static 2
 * Bar:instance 1
 * Bar:instance 2
 * Bar:constructor
 * Foo:instance 1
 * Foo:instance 2
 * Foo:constructor
 * Bar:instance 1
 * Bar:instance 2
 * Bar:name-constructor
 * Foo:instance 1
 * Foo:instance 2
 * Foo:name-constructor
 *
 * Note that the static initializers were only executed once, even though two Foo objects were created.
 * While instance and static initializers can be useful, initialization logic should be placed in constructors and methods (or static methods)
 * should be used when complex logic is required to initialize the state of an object.
 */
public abstract class Bar {
    private String name;
    static {
        System.out.println("Bar:static 1");
    }
    {
        System.out.println("Bar:instance 1");
    }
    static {
        System.out.println("Bar:static 2");
    }
    public Bar() {
        System.out.println("Bar:constructor");
    }
    {
        System.out.println("Bar:instance 2");
    }
    public Bar(String name) {
        this.name = name;
        System.out.println("Bar:name-constructor");
    }
}
class Foo extends Bar {
    static {
        System.out.println("Foo:static 1");
    }
    {
        System.out.println("Foo:instance 1");
    }
    static {
        System.out.println("Foo:static 2");
    }
    public Foo() {
        System.out.println("Foo:constructor");
    }
    public Foo(String name) {
        super(name);
        System.out.println("Foo:name-constructor");
    }
    {
        System.out.println("Foo:instance 2");
    }
    public static void main(String... args) {
        new Foo();
        System.out.println();
        new Foo("Baz");
    }
}