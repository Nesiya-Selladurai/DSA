class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        int l=0,r=0,cnt=0,pro=1;
        while(r<n){
            pro*=nums[r];
            while(l<n && pro>=k){
                pro/=nums[l];
                l++;
            }
            cnt+=r-l+1;
            r++;
        }
        return cnt;
    }
}