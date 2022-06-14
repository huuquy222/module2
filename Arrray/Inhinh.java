package Arrray;

import java.util.Scanner;

public class Inhinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while(choice != 0){
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the quare triangle");
            System.out.println("Print isosceles triangle");
            System.out.println("4.Exit");
        }
        switch (choice){
            case 1:
                System.out.println("1.Print the rectangle");
                System.out.println("* * * * * * *");
                System.out.println("* * * * * * *");
                System.out.println("* * * * * * *");
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
                System.out.println("* * ");
                System.out.println("* ");
            case 4:
                System.exit(4);
            default:
                System.out.println("No choice!");
        }
    }
}

