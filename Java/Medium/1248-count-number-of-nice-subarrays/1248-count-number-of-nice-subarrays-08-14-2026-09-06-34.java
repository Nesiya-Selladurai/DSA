class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return solve(nums,k)-solve(nums,k-1);
    }
        static int solve(int[] nums,int k){
        int n=nums.length;
        int l=0,r=0,cnt=0,ans=0;
        while(r<n){
            if(nums[r]%2==1){
                cnt++;
            }
            while(cnt>k){
                if(nums[l]%2==1) cnt--;
                l++;
            }
            ans+=r-l+1;
            r++;
        }
        return ans;
    }
}