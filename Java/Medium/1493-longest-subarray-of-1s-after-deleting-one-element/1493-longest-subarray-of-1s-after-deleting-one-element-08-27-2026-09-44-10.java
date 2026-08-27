class Solution {
    public int longestSubarray(int[] nums) {
        int z=0;
        int n=nums.length;
        for(int i:nums){
            if(i==0) z++;
        }
        if(z==0) return n-1;
        int l=0,r=0,zero=0,maxlen=0;
        while(r<n){
            if(nums[r]==0){
                zero++;
            }
            while(zero>1){
                if(nums[l]==0) zero--;
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1-zero);
            r++;
        }
        return maxlen;
    }
}