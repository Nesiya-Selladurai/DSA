class Solution {
    public int findPeakElement(int[] nums) {
        int k=0,n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                k=i;
                break;
            }
        }
        int l=0,r=0;
        while(r<n){
            int mid=(l+r)/2;
            if(nums[mid]<nums[r]){
                l++;
            }
            else{
                r++;
            }
        }
        return l;
    }
}