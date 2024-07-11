package Sorting_Algorithms;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {13, 20, 12, 50, 43, 87};
        bubbleSort(arr, 6);
    }
    public static void bubbleSort(int arr[], int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
