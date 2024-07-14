package Binary_Search.BS_on_1D_Array;

public class Insert_Index {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int insertIndex = 0;
        
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                start = mid + 1;
                insertIndex = mid + 1;
            }else{
                end = mid - 1;
                insertIndex = mid;
            }    
        }
        return insertIndex;
    }
}

