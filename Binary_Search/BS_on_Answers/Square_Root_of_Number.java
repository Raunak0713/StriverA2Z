package Binary_Search.BS_on_Answers;

public class Square_Root_of_Number {
    long floorSqrt(long x){
        long low = 1;
        long high = x;
        long ans = 0;
        
        while(low <= high){
            long mid = low + (high-low)/2;
            
            if((mid * mid) > x){
                high = mid - 1;
            }
            
            if( (mid*mid) <= x){
                ans = mid;
                low = mid + 1;
            }
        }
        return ans;
    }
}
