package Sorting_Algorithms;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {13, 20, 12, 50, 43, 87};
        selectionSort(arr, 6);
    }
    static void selectionSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
