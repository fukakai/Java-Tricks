package com.dalichamp.romain.java.secrets.annotations;

import java.lang.annotation.Annotation;

public class FooTest implements Test {
    @Override
    public String name() {
        return "Foo";
    }
    @Override
    public Class<? extends Annotation> annotationType() {
        return Test.class;
    }
}