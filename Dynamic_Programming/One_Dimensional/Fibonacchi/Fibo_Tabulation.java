package Dynamic_Programming.One_Dimensional.Fibonacchi;

import java.util.Arrays;

public class Fibo_Tabulation {
    int[] DP;
    public int fib(int n) {
        DP = new int[n+1];
        Arrays.fill(DP, -1);
        return solve(n);
    }
    public int solve(int n){
        if(n<=1) return n;
        DP[0] = 0;
        DP[1] = 1;
        for(int i=2; i<=n; i++){
            DP[i] = DP[i-1] + DP[i-2];
        }
        return DP[n];
    }
}
