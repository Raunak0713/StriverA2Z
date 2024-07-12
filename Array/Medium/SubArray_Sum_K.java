package Array.Medium;

import java.util.HashMap;

public class SubArray_Sum_K {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        ans.put(0,1);
        int count = 0;
        int prefixSum = 0;

        for(int a : nums){
            prefixSum += a;

            int required = prefixSum - k;

            if(ans.containsKey(required)){
                count += ans.get(required);
            }

            ans.put(prefixSum, ans.getOrDefault(prefixSum,0)+1);
        }

        return count;
    }
}
