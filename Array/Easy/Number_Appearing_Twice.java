package Array.Easy;

import java.util.HashMap;

public class Number_Appearing_Twice {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(int a : nums){
            ans.put(a, ans.getOrDefault(a,0)+1);
        }
        for(int a : ans.keySet()){
            if(ans.get(a) == 1){
                return a;
            }        
        }
        return -1;
    }
}
