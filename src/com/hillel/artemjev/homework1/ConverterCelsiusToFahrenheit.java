package com.hillel.artemjev.homework1;

import java.util.Scanner;

public class ConverterCelsiusToFahrenheit {

    public static void main(String[] args) {
        System.out.println("('q' to exit the program)\nEnter a temperature in degrees celsius:");


        double degCelsius;
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (sc.hasNextDouble()){
                degCelsius = sc.nextDouble();
                break;
            } else {
                if  (sc.nextLine().equals("q")) {
                    return;
                };
                System.out.println("Please, enter a correct value (decimal number):");
            }
        }
        sc.close();

        //−273,15 °C - Absolute zero temperature
        if (degCelsius <= -273.15) {
            System.out.println("The entered value is unreachable in our material world, but we will still calculate)");
        }

        double degFahrenheit = convertCelsiusToFahrenheit(degCelsius);
        System.out.printf("%.2f degrees celsius equals %.2f degrees Fahrenheit", degCelsius, degFahrenheit);


    }

    private static double convertCelsiusToFahrenheit (double celsius) {
        return celsius * 1.8 + 32;
    }
}


