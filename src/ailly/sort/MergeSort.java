package ailly.sort;

public class MergeSort {
    public static int[] aux;

    public static void sort(int[] arr) {
        aux = new int[arr.length];
        sort(arr, 0, arr.length-1);
    }

    public static void sort(int[] arr, int low, int high) {
        if (high <= low)
            return;
        int mid = low + (high - low) / 2;
        sort(arr, low, mid);
        sort(arr, mid+1, high);
        merge(arr, low, mid, high);

    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid+1;
        for (int k = low; k <= high; k++)
            aux[k] = arr[k];
        for (int k = low; k <= high; k++) {
            if (i > mid) arr[k] = aux[j++];
            else if (j > high) arr[k] = aux[i++];
            else if (aux[i] < aux[j]) arr[k] = aux[i++];
            else arr[k] = aux[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {10,34,2,56,7,67,88,42};
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        MergeSort.sort(arr1);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}
