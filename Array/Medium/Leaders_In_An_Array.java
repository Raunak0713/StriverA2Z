package Array.Medium;

import java.util.ArrayList;

public class Leaders_In_An_Array {
    static ArrayList<Integer> leaders(int n, int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int maxSoFar = 0;
        for(int i=n-1; i>=0; i--){
            if(arr[i] >= maxSoFar){
                ans.add(arr[i]);
                maxSoFar = arr[i];
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<ans.size(); i++){
            res.add(ans.get(ans.size() - 1 - i));
        }
        return res;
    }
}
