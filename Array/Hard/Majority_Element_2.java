package Array.Hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Majority_Element_2{
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int n = nums.length;

        for(int a : nums){
            ans.put(a, ans.getOrDefault(a,0)+1);
        }

        for(int a : ans.keySet()){
            if(3 * ans.get(a) > n){
                list.add(a);
            }
        }
        return list;
    }
}