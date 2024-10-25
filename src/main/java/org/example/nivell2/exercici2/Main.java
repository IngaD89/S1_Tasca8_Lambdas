package org.example.nivell2.exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

       String oddEvenNumbers = numbers
                .stream()
                .map((number) -> (number % 2 == 0) ? "e" + number : "o" + number)
                .collect(Collectors.joining(", "));

        System.out.println(oddEvenNumbers);
    }
}
