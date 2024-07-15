package Binary_Search.BS_on_Answers;

public class Capacity_to_Ship {
    public int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int sum = 0;

        for(int a : weights){
            max = Math.max(max ,a);
            sum += a;
        }

        int low = max;
        int high = sum;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(CanTake(weights, mid, days)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean CanTake(int[] arr, int cap, int days){
        int totalDays = 1;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(sum + arr[i] <= cap){
                sum += arr[i];
            }
            else{
                totalDays += 1;
                sum = arr[i];
            }
        }
        return totalDays <= days;
    }
}
