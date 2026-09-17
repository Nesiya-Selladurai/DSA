class Solution {
    public int minSubArrayLen(int t, int[] nums) {
        int n=nums.length;
        int l=0,r=0;
        int sum=0,minlen=Integer.MAX_VALUE;
        while(r<n){
            sum+=nums[r];
            while(sum>=t){
                minlen=Math.min(minlen,r-l+1);
                sum-=nums[l];
                l++;
            }
            r++;
        }
        return minlen==Integer.MAX_VALUE? 0 : minlen;
    }
}