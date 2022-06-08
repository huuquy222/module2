package Bai2;

public class Timsoduongnhonhat {
    public static void main(String[] args) {
        int min;
        int arr[] = {2, 4, 6, 8, 10, 12};
        min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] < min) ;
            min = arr[i];

        }
        System.out.println(min);
    }
}
