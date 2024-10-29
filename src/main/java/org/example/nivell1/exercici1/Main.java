package org.example.nivell1.exercici1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        containsO();

    }

    public static void containsO(){
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("Java");
        stringList.add("World");

        stringList
                .stream()
                .filter(s -> s.contains("o"))
                .forEach(System.out::println);
    }
}