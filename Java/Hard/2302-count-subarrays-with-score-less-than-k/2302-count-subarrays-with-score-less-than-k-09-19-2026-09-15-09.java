class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n=nums.length;
        int r=0,l=0;
        long sum=0;
        long cnt=0;
        while(r<n){
            sum+=nums[r];
            while(l<=r && sum*(r-l+1)>=k){
                sum-=nums[l];
                l++;
            }
            cnt+=(r-l+1);
            r++;
        }
        return cnt;
    }
}