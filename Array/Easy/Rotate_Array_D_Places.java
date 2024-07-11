package Array.Easy;

public class Rotate_Array_D_Places {
    public void rotate(int[] nums, int d) {
        int n = nums.length;
        d = d % n;
        int[] ans = new int[n];
        int index = 0;

        for (int i = n - d; i < n; i++) {
            ans[index++] = nums[i];
        }

        for (int i = 0; i < n - d; i++) {
            ans[index++] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = ans[i];
        }
    }    
}
