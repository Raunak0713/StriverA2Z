package Array.Hard;

import java.util.ArrayList;
import java.util.HashMap;

public class Subarray_with_XOR {
    public int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int xor = 0;
        int count = 0;

        for (int num : A) {
            xor ^= num;

            if (xor == B) {
                count++;
            }

            if (map.containsKey(xor ^ B)) {
                count += map.get(xor ^ B);
            }

            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }

        return count;
    }
}
