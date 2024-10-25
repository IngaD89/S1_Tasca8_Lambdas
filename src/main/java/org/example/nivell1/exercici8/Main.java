package org.example.nivell1.exercici8;

public class Main {
    public static void main(String[] args) {
        Reverse reverse = (s) -> String.valueOf(new StringBuilder(s).reverse());

        String word = "Hola";
        String reversedWord = reverse.reverse(word);

        System.out.println(word);
        System.out.println(reversedWord);
    }
}
