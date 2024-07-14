package Array.Hard;

public class Maximum_Product_Subarray {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            // If num is negative, swapping maxProduct and minProduct
            if (num < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            // Update maxProduct and minProduct
            maxProduct = Math.max(num, maxProduct * num);
            minProduct = Math.min(num, minProduct * num);

            // Update result
            result = Math.max(result, maxProduct);
        }

        return result;
    }
}
