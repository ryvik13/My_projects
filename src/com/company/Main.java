package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double number1, number2;
        String operator;
        double result;
        Scanner in = new Scanner(System.in);
        number1 = read.readNumber(in, "Enter first number:");
        number2 = read.readNumber(in, "Enter second number:");
        System.out.println("Enter operator");
        operator = in.next();
        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                if (number2 == 0) {
                    System.out.println("Cannot divide by zero");
                    System.exit(1);
                }
                result = number1 / number2;
                break;
            default:
                System.out.println("Operator is incorrect");
                return;
        }
        System.out.println("Result = " + result);
    }
}


