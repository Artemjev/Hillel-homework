package com.hillel.artemjev.homework2;

import java.util.Arrays;
import java.util.Scanner;


public class PointsInCircle {

    public static void main(String[] args) {
        Point[] pointArray = new Point[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("\nPlease enter coordinates of 10 points.");

        for (int i=0; i<pointArray.length; i++){
            System.out.printf("\nEnter point #%d",i+1);
            pointArray[i] = enterPoint(sc);
        }

        Circle circle = enterCircle(sc);

        sc.close();

        System.out.println("\nThanks, we have the entered list of points:");
        System.out.println(Arrays.toString(pointArray));
        System.out.println("\nAnd we have the circle:");
        System.out.println(circle);

        System.out.println("\nThe following points lie in the circle:");
        for (Point p:pointArray) {
            if (circle.containsPoint(p)) {
                System.out.println(p);
            }
        }
    }

    //--------------------------------------------------------------------------
    private static Point enterPoint(Scanner sc) {
        double x;
        double y;

        System.out.print("\nEnter X coordinate: ");
        x = readDecimalNumber(sc);

        System.out.print("Enter Y coordinate: ");
        y = readDecimalNumber(sc);

        return new Point(x, y);
    }

    //--------------------------------------------------------------------------
    public static double readDecimalNumber(Scanner sc) {
        double num;
        while (true) {
            if (sc.hasNextDouble()) {
                num = sc.nextDouble();
                break;
            } else {
//                System.out.println("Please, enter a correct value (decimal number):");//-почему так(c -ln), при вводе
                // некорректного значения во 2-м считывании запись дублируется???? https://prnt.sc/vo1r1s
                System.out.print("Please, enter a correct value (decimal number):");
                sc.nextLine();
            }
        }
        return num;
    }

    //--------------------------------------------------------------------------
    private static Circle enterCircle(Scanner sc) {
        System.out.print("\nEnter center of circle");
        Point center = enterPoint(sc);
        System.out.print("Enter circle radius: ");
        double radius = readDecimalNumber(sc);
        return new Circle(center, radius);
    }
}
