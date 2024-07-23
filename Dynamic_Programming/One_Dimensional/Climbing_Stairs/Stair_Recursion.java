package Dynamic_Programming.One_Dimensional.Climbing_Stairs;

public class Stair_Recursion {
    public int climbStairs(int n) {
        return solve(0, n);
    }
    public int solve(int i, int n){
        if(i > n) return 0;
        if(i==n) return 1;
        int One_Step = solve(i+1, n);
        int Two_Step = solve(i+2, n);
        return One_Step + Two_Step;
    }
}
