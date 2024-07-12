package Array.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Three_Sum {

    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            HashSet<Integer> st = new HashSet<>();
            for(int j=i+1; j<nums.length; j++){
                int third = - (nums[i] + nums[j]);
                if(st.contains(third)){
                    List<Integer> ans = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(ans);
                    set.add(ans);
                }
                st.add(nums[j]);
            }
        }
        List<List<Integer>> meow = new ArrayList<>();
        for(List<Integer> a : set){
            meow.add(a);
        }
        return meow;
    }

    public List<List<Integer>> threeSumOptimised(int[] nums) {
        HashSet<List<Integer>> ans = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){   
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = n-1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0){
                    j++;
                }else if(sum > 0){
                    k--;
                }else{
                    List<Integer> res = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(res);
                    j++;
                    k--;
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
