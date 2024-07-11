package Array.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Remove_Duplicates {
    public static void main(String[] args){
        List<Integer> ans = new ArrayList<>(Arrays.asList(1, 5, 5, 24, 24, 43));
        int a = remove_duplicate(ans);
        System.out.println("New length: " + a);
        System.out.println("Modified list: " + ans.subList(0, a));
    }

    public static int remove_duplicate(List<Integer> arr) {
        if (arr.size() == 0) {
            return 0;
        }

        int i = 0;
        int j = 1;
        int N = arr.size();
        
        while (j < N) {
            if (!arr.get(i).equals(arr.get(j))) {
                i++;
                arr.set(i, arr.get(j));
            }
            j++;
        }
        
        return i + 1;
    }
}
