class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int l=0,r=0,sum=0,minlen=Integer.MAX_VALUE;
        while(r<n){
            sum+=nums[r];
            while(l<n && sum>=target){
                sum-=nums[l];
                minlen=Math.min(minlen,r-l+1);
                l++;
            }
            r++;
        }
        return minlen==Integer.MAX_VALUE ? 0 : minlen;
    }
}