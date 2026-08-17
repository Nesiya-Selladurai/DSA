class Solution {
    public int maxFrequency(int[] nums, int k) {
       Arrays.sort(nums);
       int l=0,r=0,maxlen=0;
       int n=nums.length;
       long sum=0;
       while(r<n){
        sum+=nums[r];
        long cost=(long)nums[r]*(r-l+1)-sum;
        while(cost>k){
            sum-=nums[l];
            l++;
            cost=(long)nums[r]*(r-l+1)-sum;
        }
        maxlen=Math.max(maxlen,r-l+1);
        r++;
       } 
       return maxlen;
    }
}