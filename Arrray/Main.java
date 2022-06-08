package Arrray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter a size");
            size = scanner.nextInt();
            if(size > 20);
            System.out.println("size does not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter elemnet " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
            System.out.printf("%-20s%s", "Elements in array: ","");
            for (int j = 0 ; j < array.length; j++) {
                System.out.println(array[j] + "\t");
            }
            for (int j = 0; j < array.length; j++) {
                int temp = array[i];
                array[j] = array[size - 1 - j];
                array[size - 1 -j] = temp;
            }
            System.out.printf("\n%-20s5s", "reverse array: ", "");
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[j] + "\t");
            }

        }
        System.out.println();
    }
}
