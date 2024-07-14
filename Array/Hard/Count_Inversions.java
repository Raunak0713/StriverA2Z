package Array.Hard;

public class Count_Inversions {
    static long count;
    static long inversionCount(long arr[], int n) {
        count = 0;
        MergeSort(arr, 0, n-1);
        return count;
    }
    static void MergeSort(long[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int mid = low + (high-low)/2;
        MergeSort(arr, low, mid);
        MergeSort(arr, mid+1, high);
        Merge(arr, low, mid, high);
    }
    static void Merge(long[] arr, int low, int mid, int high){
        long[] temp = new long[high-low+1];
        
        int left = low;
        int right = mid+1;
        int index = 0;
        
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[index++] = arr[left++];
            }else{
                temp[index++] = arr[right++];
                count += (mid - left + 1);
            }
        }
        
        while(left <= mid){
            temp[index++] = arr[left++];
        }
        
        while(right <= high){
            temp[index++] = arr[right++];
        }
        
        for(int i=low; i<=high; i++){
            arr[i] = temp[i-low];
        }
    }
}
