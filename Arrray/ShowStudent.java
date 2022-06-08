package Arrray;

import java.util.Scanner;

public class ShowStudent {
    public static void main(String[] args) {
        String[] students = {"Vũ", "Thiện", "Pháp", "Lượng", "Thiên"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name students");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length ; i++) {
            if (students[i].equals(input_name)){
                System.out.println("position of the students in the list" + input_name + i);
                isExist = true;
                break;
            }
        }
        if (!isExist)
        System.out.println("Not found" + input_name + "in the list.");
    }
}
