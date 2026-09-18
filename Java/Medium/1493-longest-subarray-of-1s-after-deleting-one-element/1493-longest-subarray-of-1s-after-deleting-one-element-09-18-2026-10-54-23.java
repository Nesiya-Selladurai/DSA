class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int l=0,r=0,zero=0,max=0;
        while(r<n){
            if(nums[r]==0){
                zero++;
            }
            while(l<n && zero>1){
                if(nums[l]==0){
                    zero--;
                }
                l++;
            }
            max=Math.max(max,r-l);
            r++;
        }
        return max;
    }
}