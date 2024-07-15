package Binary_Search.BS_on_Answers;

public class Find_the_Smallest_Divisor_Given_a_Threshold {
    public int smallestDivisor(int[] nums, int threshold) {
        long sum = 0;
        for(int a : nums){
            sum += a;
        }

        long low = 1;
        long high = sum;

        while(low <= high){
            long mid = low + (high-low)/2;

            if(IsUnderThresHold(nums, mid, threshold)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return (int) low;
    }

    public boolean IsUnderThresHold(int[] nums, long mid, int threshold){
        int sum = 0;
        for(int a : nums){
            if(a%mid == 0){
                sum += a/mid;
            }
            else{
                sum += (a/mid) + 1;
            }
        }
        return sum <= threshold;
    }
}
