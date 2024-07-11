package Sorting_Algorithms;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10, 13, 50, 32, 1, 5, 98};
        MerSort(arr, 0, arr.length-1);
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
    public static void MerSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int mid = (low + high) / 2;
        MerSort(arr, low, mid);
        MerSort(arr, mid+1, high);
        Merge(arr, low, mid, high);
    }
    public static void Merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int index = 0;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[index] = arr[left];
                left++;
                index++;
            }else{
                temp[index] = arr[right];
                right++;
                index++;
            }
        }

        while(left <= mid){
            temp[index] = arr[left];
            left++;
            index++;
        }

        while(right <= high){
            temp[index] = arr[right];
            right++;
            index++;
        }

        for(int i=low; i<=high; i++){
            arr[i] = temp[i - low];
        }
    }
}
