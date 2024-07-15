package Binary_Search.BS_on_Answers;

public class Koko_Eating_Banana {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for (int a : piles) {
            max = Math.max(max, a);
        }

        int low = 1;
        int high = max;
        int result = max;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (BananaTime(piles, mid) <= h) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    public int BananaTime(int[] arr, int k) {
        int totalTime = 0;
        for (int a : arr) {
            totalTime += Math.ceil((double) a / (double) k);
        }
        return totalTime;
    }
}
