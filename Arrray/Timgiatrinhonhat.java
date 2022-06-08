package Arrray;

public class Timgiatrinhonhat {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int inndex = minValue(arr);
        System.out.println("the smallest elemnet in the array is: " + arr[inndex]);
    }
    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}