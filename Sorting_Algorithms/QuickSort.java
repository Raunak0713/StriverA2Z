package Sorting_Algorithms;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {12, 43, 1, 40 ,95, 5};
        QuicSort(arr, 0, arr.length - 1);
        for(int a : arr){
            System.out.print(a + " ");
        }
    }

    public static void QuicSort(int[] arr, int low, int high){
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            QuicSort(arr, low, partitionIndex - 1);
            QuicSort(arr, partitionIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high]; 
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                Swap(arr, i, j);
            }
        }

        Swap(arr, i + 1, high);

        return i + 1;
    }

    public static void Swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
