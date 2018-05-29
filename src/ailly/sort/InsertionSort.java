package ailly.sort;

public class InsertionSort {
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && (arr[j] < arr[j-1]); j--) {
                int tmp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = tmp;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr1 = {10,34,2,56,7,67,88,42};
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        InsertionSort.sort(arr1);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}
