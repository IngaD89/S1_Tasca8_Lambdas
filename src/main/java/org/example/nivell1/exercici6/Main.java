package org.example.nivell1.exercici6;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Object> objList = Arrays.asList(1, 2, "Inga", "Demetrashvili");

        objList
                .stream()
                .filter(o -> o instanceof String)
                .map(o -> (String) o)
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }
}
