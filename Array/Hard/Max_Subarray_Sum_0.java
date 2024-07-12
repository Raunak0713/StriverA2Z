package Array.Hard;

import java.util.HashMap;

public class Max_Subarray_Sum_0 {
    int maxLen(int arr[], int n){
        HashMap<Integer,Integer> ans = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        
        for(int i=0 ;i<n; i++){
            sum += arr[i];
            
            if(sum == 0){
                maxLength = i+1;
            }
            
            if(ans.containsKey(sum)){
                maxLength = Math.max(maxLength, i-ans.get(sum));
            }else{
                ans.put(sum, i);
            }
        }
        return maxLength;
    }
}
