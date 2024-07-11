package Array.Medium;

public class Alternate_Signs {
    public int[] rearrangeArray(int[] nums) {
        int pc = 0;
        int nc = 0;
        for(int a : nums){
            if(a >= 0){
                pc++;
            }else{
                nc++;
            }
        }
        int[] pos = new int[pc];
        int[] neg = new int[nc];
        int pi = 0;
        int ni = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] >= 0){
                pos[pi++] = nums[i];
            }else{
                neg[ni++] = nums[i];
            }
        }

        pi = 0;
        ni = 0;

        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                nums[i] = pos[pi++];
            }else{
                nums[i] = neg[ni++];
            }
        }

        return nums;
    }
}
