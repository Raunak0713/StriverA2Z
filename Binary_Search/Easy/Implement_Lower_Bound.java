package Binary_Search.Easy;

public class Implement_Lower_Bound {
    static int findFloor(long arr[], int n, long x) {
        int start = 0;
        int end = arr.length-1;
        int index = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid] < x){
                start = mid + 1;
                index = mid;
            }else{
                end = mid - 1;
            }
        }
        return index;
    }
}
