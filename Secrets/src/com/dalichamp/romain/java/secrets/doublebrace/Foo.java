package com.dalichamp.romain.java.secrets.doublebrace;

import java.util.HashMap;
import java.util.Map;

public class Foo {
    public static void main(String... args) {

        // Naive initialization
        Map<String, Integer> myMapUno = new HashMap<>();
        myMapUno.put("Foo", 10);
        myMapUno.put("Bar", 15);
        myMapUno.entrySet().stream().forEach(System.out::println);
        System.out.println("--");

        // Double-brace initialization
        Map<String, Integer> myMapDos = new HashMap<>() {{
            put("Foo", 10);
            put("Bar", 15);
        }};
        myMapDos.entrySet().stream().forEach(System.out::println);
        System.out.println("--");

        // Static factory initialization
        Map<String, Integer> myMapTres = Map.of("Foo", 10, "Bar", 15);
        myMapTres.entrySet().stream().forEach(System.out::println);
    }
}