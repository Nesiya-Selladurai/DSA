class Solution {
    public long countSubarrays(int[] nums, int k) {
      int max=0;
      for(int i:nums){
        max=Math.max(max,i);
      }
      int cnt=0,l=0;
      long ans=0;
      int n=nums.length;
      for(int i=0;i<n;i++){
        if(nums[i]==max){
            cnt++;
        }
        while(cnt>=k){
            if(nums[l]==max){
                cnt--;
            }
            l++;
        }
        ans+=l;
        }
      return ans;
    }
}