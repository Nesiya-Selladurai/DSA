class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       return solve(nums,goal)-solve(nums,goal-1); 
    }
    static int solve(int[] nums,int g){
        int n=nums.length;
        int l=0,r=0;
        int sum=0,ans=0;
        if(g<0) return 0;
        while(r<n){
            sum+=nums[r];
            while(sum>g){
                sum-=nums[l];
                l++;
            }
            ans+=r-l+1;
            r++;
        }
        return ans;
    }
}