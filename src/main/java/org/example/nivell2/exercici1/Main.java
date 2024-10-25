package org.example.nivell2.exercici1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ana");
        names.add("Inga");
        names.add("ana");
        names.add("Maria");
        names.add("Ala");

        names
                .stream()
                .filter(name -> name.startsWith("A") && name.length() == 3)
                .forEach(System.out::println);
    }
}
