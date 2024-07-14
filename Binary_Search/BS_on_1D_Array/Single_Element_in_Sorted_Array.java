package Binary_Search.BS_on_1D_Array;

public class Single_Element_in_Sorted_Array {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;

        if(n == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n-1] != nums[n-2]) return nums[n-1];

        int low = 1;
        int high = nums.length - 2;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(nums[mid-1] != nums[mid] && nums[mid] != nums[mid+1]){
                return nums[mid];
            }

            if( (mid%2 == 1 && nums[mid-1] == nums[mid]) || (mid%2 == 0 && nums[mid] == nums[mid+1]) ){
                low = mid + 1;
            }
            else if( (mid%2 == 1 && nums[mid] == nums[mid+1]) || (mid%2 == 0 && nums[mid-1] == nums[mid]) ){
                high = mid - 1;
            }
        }
        return -1;
    }
}
