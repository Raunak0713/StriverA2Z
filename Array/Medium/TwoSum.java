package Array.Medium;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> ans = new HashMap<>();
        int n = nums.length;
        
        for(int i=0; i<n; i++){
            int req = target - nums[i];

            if(ans.containsKey(req)){
                return new int[] {ans.get(req),i};
            }

            ans.put(nums[i], i);
        }

        return new int[] {};
    }
}
