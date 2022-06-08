package Baitap;

import java.awt.*;
import java.util.Scanner;

public class Hahahahaa {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {

            System.out.println("Menu");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle(the correct is square at 4 different angle: top- left, top-right, botton-left, botton-right");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("* * * * * * * * * * *");
                    System.out.println("* * * * * * * * * * *");
                    System.out.println("* * * * * * * * * * *");
                    System.out.println("* * * * * * * * * * *");
                case 2:
                    System.out.println("*");
                    System.out.println("* *");
                    System.out.println("* * *");
                    System.out.println("* * * *");
                    System.out.println("* * * * *");
                case 3:
                    System.out.println("* * * * *");
                    System.out.println("* * * *");
                    System.out.println("* * *");
                    System.out.println("* *");
                    System.out.println("*");

                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
