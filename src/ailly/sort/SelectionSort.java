package ailly.sort;

public class SelectionSort {
    public static void sort(int[] a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                min = (a[min] < a[j]) ? min : j;
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 9, -1, 0, 100, 89};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        SelectionSort.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
