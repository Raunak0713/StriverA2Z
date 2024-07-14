package Binary_Search.BS_on_1D_Array;

public class Count_Occurence {
    int count(int[] arr, int n, int x) {
        int firstPos = findFirstPosition(arr, x);
        if (firstPos == -1) {
            return 0; // If the first position is -1, the target is not in the array
        }
        int lastPos = findLastPosition(arr, x);
        return lastPos - firstPos + 1;
    }

    int findFirstPosition(int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if (nums[mid] == target) index = mid;
        }
        return index;
    }

    int findLastPosition(int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            if (nums[mid] == target) index = mid;
        }
        return index;
    }
}
