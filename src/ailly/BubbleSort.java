package ailly;

public class BubbleSort {
    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {10,34,2,56,7,67,88,42};
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        BubbleSort.sort(arr1);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}
