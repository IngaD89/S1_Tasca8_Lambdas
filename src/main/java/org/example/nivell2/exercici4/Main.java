package org.example.nivell2.exercici4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
      private static final List<String> numAndTextList = new ArrayList<>();
    public static void main(String[] args) {
        numAndTextList.add("6");
        numAndTextList.add("inga");
        numAndTextList.add("4");
        numAndTextList.add("deme");
        numAndTextList.add("5");
        numAndTextList.add("Anna");
        numAndTextList.add("anahit");
        numAndTextList.add("zoe");

        ascendingOrder();
        orderByE();
        changeA();
        showNumbers();

    }


    public static void ascendingOrder(){
        //TODO no he entendido si debo mostrar solo la primera letra o solo ordenar los elementos
        System.out.println("\nLista ordenada alfabéticamente");
        numAndTextList
                .stream()
                //.map(s -> s.charAt(0))
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }

    public static void orderByE(){
        System.out.println("\nOrden de lista: palabras con 'e' primero, luego el resto");

        List<String> orderedList = Stream.concat(
                numAndTextList.stream().filter(s -> s.contains("e") || s.contains("E")).sorted(),
                numAndTextList.stream().filter(s -> !s.contains("e") || !s.contains("E")).sorted()
        ).toList();

        orderedList.forEach(System.out::println);
    }

    public static void changeA(){
        System.out.println("\nCambiar 'a' por '4'");

        numAndTextList
                .stream()
                .filter(s -> s.contains("a"))
                .map(s -> s.replace("a", "4"))
                .toList()
                .forEach(System.out::println);
    }

    public static void showNumbers(){
        System.out.println("\nMostrar solo valores numericos de la lista");

        numAndTextList
                .stream()
                .filter(s -> s.matches("[0-9]"))
                .sorted()
                .toList()
                .forEach(System.out::println);
    }
}
