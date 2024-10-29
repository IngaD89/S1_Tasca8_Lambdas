package org.example.nivell2.exercici3;

public class Main {
    public static void main(String[] args) {


        MathOperation mathOperation = ((number1, number2, operator) -> {

            float result = 0;

            switch (operator) {
                case "+" -> result = number1 + number2;
                case "-" -> result = number1 - number2;
                case "*" -> result = number1 * number2;
                case "/" -> {
                    if (number1 == 0 || number2 == 0) {
                        //System.out.println("ERROR: no se puede dividir entre cero");
                        throw new ArithmeticException("ERROR: no se puede dividir entre cero");
                    }
                    result = number1 / number2;
                }
                default -> System.out.println("Esto es una calculadora primitiva " +
                        "solo puedes hacer siguientes operaciones:  +, -, *, /");
            }
            return result;
        });

        float addition = mathOperation.operation(5,6,"+");
        float subtraction = mathOperation.operation(10,4,"-");
        float multiplication = mathOperation.operation(3,4,"*");

        float division = 0;
        try{
        division = mathOperation.operation(9,3,"/");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
    }
}
