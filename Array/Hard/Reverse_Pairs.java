package Array.Hard;

public class Reverse_Pairs {
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        return mergeSort(nums, 0, nums.length - 1);
    }

    private int mergeSort(int[] nums, int low, int high) {
        if (low >= high) {
            return 0;
        }
        int mid = low + (high - low) / 2;

        int count = mergeSort(nums, low, mid) + mergeSort(nums, mid + 1, high);

        count += merge(nums, low, mid, high);

        return count;
    }

    private int merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int index = 0;
        int count = 0;

        // Count reverse pairs
        while (left <= mid && right <= high) {
            if ((long)nums[left] > 2 * (long)nums[right]) {
                count += (mid - left + 1);
                right++;
            } else {
                left++;
            }
        }

        left = low;
        right = mid + 1;

        // Merge the two sorted halves
        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp[index++] = nums[left++];
            } else {
                temp[index++] = nums[right++];
            }
        }

        while (left <= mid) {
            temp[index++] = nums[left++];
        }

        while (right <= high) {
            temp[index++] = nums[right++];
        }

        for (int i = 0; i < temp.length; i++) {
            nums[low + i] = temp[i];
        }

        return count;
    }
}
