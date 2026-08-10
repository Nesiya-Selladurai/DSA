class Solution {
    static int solve(int i,int[] nums,int[] dp){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        dp[i]=Math.max((nums[i]+solve(i+2,nums,dp)),solve(i+1,nums,dp));
        return dp[i];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return solve(0,nums,dp);
    }
}