package Binary_Search.BS_on_Answers;

public class Nth_Square_root {
    public int NthRoot(int n, int m) {
        int low = 1;
        int high = m;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long product = power(mid, n);
            
            if (product == m) {
                return mid;
            } else if (product > m || product < 0) { // product < 0 indicates overflow
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return -1;
    }

    public long power(int base, int exp) {
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
            if (result > Integer.MAX_VALUE) {
                return -1; // Indicates overflow
            }
        }
        return result;
    }
}
