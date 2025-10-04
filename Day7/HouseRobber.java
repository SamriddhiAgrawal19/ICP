package Day7;

import java.util.Arrays;

public class HouseRobber {
    class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[]dp = new int[n+1];
        Arrays.fill(dp,-1);
        int ans = helper(nums, n , 0, dp);
        return ans;
    }
    public int helper(int[]nums, int n , int ind, int[]dp){
        if(ind>=n){
            return 0;
        }
        if(dp[ind]!=-1){
            return dp[ind];
        }
        int rob = nums[ind] + helper(nums , n, ind+2, dp);
        int notRob = helper(nums , n , ind+1,dp);
        dp[ind] = Math.max(rob , notRob);
        return dp[ind];
    }
}
}
