package Arrray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReserverArr {
    public static void main(String[] args) {


        int arr[] = {2, 4, 6, 8, 10,11};
        int arr1[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[arr.length - 1 - i];

        }
        System.out.println(Arrays.toString(arr1));
//        int temp;
//        for (int i = 0; i < arr.length / 2; i++) {
//            temp = arr[i];
//            arr[i] = arr[arr.length - 1 -i];
//            arr[arr.length - 1 -i] = temp;
//
//
//        }
//        System.out.println(Arrays.toString( arr));
//    }
    }
}