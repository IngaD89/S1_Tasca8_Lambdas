package org.example.nivell1.exercici2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        containsOAndIsMoreThenFive();
    }

    public static void containsOAndIsMoreThenFive(){
        List<String> stringList = new ArrayList<>();
        stringList.add("HellOOO");
        stringList.add("Java");
        stringList.add("Wooorld");
        stringList.add("Hola");
        stringList.add("Mundoo");

        stringList
                .stream()
                .filter(s -> (s.contains("o") || s.contains("O")) && (s.length() > 5))
                .forEach(System.out::println);
    }
}
