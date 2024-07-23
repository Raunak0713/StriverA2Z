package Dynamic_Programming.One_Dimensional.Climbing_Stairs;

import java.util.Arrays;

public class Stair_Memoization {
    int[] DP;
    public int climbStairs(int n) {
        DP = new int[n+1];
        Arrays.fill(DP,-1);
        return solve(0, n);
    }
    public int solve(int i, int n){
        if(i > n) return 0;
        if(i==n) return 1;
        if(DP[i] != -1){
            return DP[i];
        }
        int One_Step = solve(i+1, n);
        int Two_Step = solve(i+2, n);
        return DP[i] = One_Step + Two_Step;
    }
}
