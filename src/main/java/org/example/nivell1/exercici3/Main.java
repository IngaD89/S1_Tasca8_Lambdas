package org.example.nivell1.exercici3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        noneReferenceForEach();
    }

    public static void noneReferenceForEach(){
        List<String> months = new ArrayList<>();
        months.add("Enero");
        months.add("Febrero");
        months.add("Marzo");
        months.add("Abril");
        months.add("Mayo");
        months.add("Junio");
        months.add("Julio");
        months.add("Agosto");
        months.add("Septiembre");
        months.add("Octubre");
        months.add("Noviembre");
        months.add("Diciembre");

        months.forEach(mes -> System.out.println(mes));
    }
}
