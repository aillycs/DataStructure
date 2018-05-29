package ailly.sort;

public class QuickSort {
    public static void sort(int[] arr) {
        sort(arr, 0, arr.length-1);
    }

    public static void sort(int[] arr, int low, int high) {
        if (high <= low)
            return;
        int i = partition(arr, low, high);
        sort(arr, low, i);
        sort(arr, i+1, high);
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        while(low < high) {
            while (low < high && arr[high] > pivot)
                high--;
            arr[low] = arr[high];
            while (low < high && arr[low] < pivot)
                low++;
            arr[high] = arr[low];
        }
        arr[low] = pivot;
        return low;
    }

    public static void main(String[] args) {
        int[] arr1 = {10,34,2,56,7,67,88,42};
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        QuickSort.sort(arr1);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }

}
