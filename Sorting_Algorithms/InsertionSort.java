package Sorting_Algorithms;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {13, 20, 12, 50, 43, 87};
        insertionSort(arr, 6);
    }
    public static void insertionSort(int arr[], int n){
        for(int i=0; i<n; i++){
            int j = i;
            while(j>0 && arr[j-1] > arr[j]){
                swap(arr, j-1, j);
                j--;
            }
        }
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
