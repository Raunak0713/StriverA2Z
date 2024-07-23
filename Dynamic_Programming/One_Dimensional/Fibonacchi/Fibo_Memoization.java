package Dynamic_Programming.One_Dimensional.Fibonacchi;

import java.util.Arrays;

public class Fibo_Memoization {
    int[] DP;
    public int fib(int n) {
        DP = new int[n+1];
        Arrays.fill(DP, -1);
        return solve(n);
    }
    public int solve(int n){
        if(n<=1) DP[n] = n;
        if(DP[n] != -1){
            return DP[n];
        }
        return DP[n] = solve(n-1) + solve(n-2);
    }
}
