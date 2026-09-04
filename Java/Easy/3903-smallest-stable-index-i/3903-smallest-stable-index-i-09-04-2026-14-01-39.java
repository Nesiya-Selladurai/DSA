class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
            int l=0;
            int r=i;
            while(l<=i){
                max=Math.max(max,nums[l]);
                l++;
            }
            while(r<n){
                min=Math.min(min,nums[r]);
                r++;
            }
            if(max-min <= k) return i;
        }
        return -1;
    }
}