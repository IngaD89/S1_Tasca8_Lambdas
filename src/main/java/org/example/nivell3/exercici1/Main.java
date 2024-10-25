package org.example.nivell3.exercici1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        students.add(new Student("Laura", 21, "Desarrollo Web", 8.5));
        students.add(new Student("Juan", 22, "Python", 9.0));
        students.add(new Student("Sofía", 16, "PHP", 3.5));
        students.add(new Student("Carlos", 23, "Inteligencia Artificial", 3.0));
        students.add(new Student("Ana", 18, "Vue", 4.5));
        students.add(new Student("Luis", 17, "Java", 6.5));
        students.add(new Student("María", 20, "JS", 8.8));
        students.add(new Student("Diego", 19, "React", 5.0));
        students.add(new Student("Valeria", 19, "PHP", 9.2));
        students.add(new Student("Jorge", 24, "Java", 7.8));

        showByNameAndAge();
        nameContainsA();
        filterByScore();
        filterByScoreAndCourse();
        filterByCourseAndAge();
    }

    public static void showByNameAndAge() {
        System.out.println("\nMostrar estudiantes por nombre y edad");
        students.forEach(student -> {
            System.out.println("Nombre: " + student.getName() + " - Edad: " + student.getAge());
        });
    }

    public static void nameContainsA(){
        List<String> namesWithA = new ArrayList<>();

        System.out.println("\nMostrar nombres que contienen letra 'a' ");
        students
                .stream()
                .filter(student -> student.getName().contains("a") || student.getName().contains("A"))
                //.forEach(student -> namesWithA.add(String.valueOf(student)));
                .forEach(student -> namesWithA.add(student.getName()));

        namesWithA.forEach(System.out::println);
     }

     public static void filterByScore(){
         System.out.println("\nMostrar alumnos con puntuacion igual o mayor de 5");

         students
                 .stream()
                 .filter(student -> student.getScore() >= 5)
                 .forEach(System.out::println);
     }

     public static void filterByScoreAndCourse(){
         System.out.println("\nMostrar alumnos con puntuación >= 5, excluyendo a los de PHP");

         students
                 .stream()
                 .filter(student -> student.getScore() >= 5 && !student.getCourse().equals("PHP"))
                 .forEach(System.out::println);
     }

     public static void filterByCourseAndAge(){
         System.out.println("\nMostrar alumnos que hacen Java y son mayores de edad");

        students
                .stream()
                .filter(student -> student.getCourse().equals("Java") && student.getAge() >= 18)
                .forEach(System.out::println);
     }
}
