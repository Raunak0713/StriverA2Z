package Binary_Search.BS_on_Answers;

public class Make_Bouquets {
    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long) m * k;
        if(val > bloomDay.length) return -1;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int a : bloomDay){
            max = Math.max(max, a);
            min = Math.min(min, a);
        }

        int low = min;
        int high = max;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(CanMakeBouquets(bloomDay, mid, m, k)){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean CanMakeBouquets(int[] arr, int target, int bouquets, int size){
        int counter = 0;
        int bou = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] <= target){
                counter++;
            }
            else{
                bou += counter/size;
                counter = 0;
            }
        }
        bou += (counter/size);
        return bou >= bouquets;
    }
}
