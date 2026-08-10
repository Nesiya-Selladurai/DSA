class Solution {
    static int solve(int i,int n,int[] nums,int[] dp){
        if(i>n){
            return 0;
        }
        if(dp[i]!=-1) return dp[i];
        dp[i]=Math.max(
            (
            nums[i]+solve(i+2,n,nums,dp)
            ),
            solve(i+1,n,nums,dp) 
        );
        return dp[i];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
            return nums[0];
        int[] dp1=new int[n];
        int[] dp2=new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        int case1 =solve(0,n-2,nums,dp1);
        int case2=solve(1,n-1,nums,dp2);
        return Math.max(case1, case2);
    }
}