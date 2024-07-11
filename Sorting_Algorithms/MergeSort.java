package Sorting_Algorithms;

import java.util.ArrayList;

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
        ArrayList<Integer> ans = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                ans.add(arr[left]);
                left++;
            }else{
                ans.add(arr[right]);
                right++;
            }
        }

        while(left <= mid){
            ans.add(arr[left]);
            left++;
        }

        while(right <= high){
            ans.add(arr[right]);
            right++;
        }

        for(int i=low; i<high; i++){
            arr[i] = ans.get(i - low);
        }
    }
}
