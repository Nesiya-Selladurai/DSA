class Solution {
    public long countSubarrays(int[] nums, long k) {
        long sum=0,cnt=0;
        int l=0,r=0;
        int n=nums.length;
        while(r<n){
            sum+=nums[r];
            while(l<=r && sum*(r-l+1) >= k){
                sum-=nums[l];
                l++;
            }
            cnt+=(r-l+1);
            r++;
        }
        return cnt;
    }
}