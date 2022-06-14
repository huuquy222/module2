package Arrray;

import java.util.Arrays;

public class Deleteelementinarray {
    public static void main(String[] args) {
        int arr[] ={10, 4, 6, 7, 8, 6, 0, 0, 0};
        int x = 7;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == x)
                arr[i] = arr[arr.length - 1 ];


        }
        System.out.println(Arrays.toString(arr));

    }
}
