package bai1;

import java.util.Scanner;

public class Main4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which month that you want to count days? ");
        int month = scanner.nextInt();
//        double daysInMonth = 28,29, 31;
        String daysInMonth = "";
        switch (month)
        {
            case 2:
                System.out.println("the month '2' has 28 or 29 days!");
                daysInMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                System.out.println("The month '" + month + "'has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                System.out.println("The month '" + month + "'has 31 days");
                break;
            default:
                System.out.println("Invanlid input");
                break;
        }
        System.out.println();
    }
}
