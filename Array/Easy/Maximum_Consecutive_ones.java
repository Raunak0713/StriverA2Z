package Array.Easy;

public class Maximum_Consecutive_ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxcount = 0;
        int count = 0;
        for(int a : nums){
            if(a == 1){
                count++;
                if(count > maxcount){
                    maxcount = count;
                }
            }else{
                count = 0;
            }
        }
        return maxcount;
    }
}
