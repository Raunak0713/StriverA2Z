package Array.Easy;

public class Binary_Search {
    static int searchInSorted(int arr[], int N, int K) {
        int low = 0;
        int high = N - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2; 

            if (arr[mid] == K) {
                return 1;
            } 
            if (arr[mid] < K) {
                low = mid + 1; 
            } else {
                high = mid - 1;
            }
        }
        
        return -1; 
    }
}
