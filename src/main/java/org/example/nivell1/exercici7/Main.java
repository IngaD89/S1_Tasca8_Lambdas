package org.example.nivell1.exercici7;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> objList = Arrays.asList(1, 2, "Inga", "Demetrashvili");

        objList
                .stream()
                .filter(o -> o instanceof String)
                .map(o -> (String) o)
                .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
                .forEach(System.out::println);
    }
}
