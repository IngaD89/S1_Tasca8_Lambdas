package org.example.nivell1.exercici6;

import java.util.*;

public class Main {
    private static final List<Object> objList = Arrays.asList(1, 2, "Inga", "Demetrashvili");

    public static void main(String[] args) {
        filterAndOrderString();
        orderAllObj();
    }

    public static void filterAndOrderString() {
        System.out.println("\nFiltrar y ordenar los Strings:");

        objList
                .stream()
                .filter(o -> o instanceof String)
                .map(o -> (String) o)
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }

    public static void orderAllObj() {
        System.out.println("\nOrdenar todos los objetos convirtiendolos a String:");

        objList
                .stream()
                .map(Objects::toString)
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }
}
