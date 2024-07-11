package Array.Easy;

import java.util.HashMap;

public class Longest_Subarray_SumK {
    public static int lenOfLongSubarr (int A[], int N, int K) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        ans.put(0,-1);
        
        int length = 0;
        int prefixSum = 0;
        
        for(int i=0; i<N; i++){
            prefixSum += A[i];
            
            int required = prefixSum - K;
            
            if(ans.containsKey(required)){
                int sublength = i - ans.get(required);
                if(sublength > length){
                    length = sublength;
                }
            }
            
            if(!ans.containsKey(prefixSum)){
                ans.put(prefixSum, i);
            }
        }
        return length;
    }
}
