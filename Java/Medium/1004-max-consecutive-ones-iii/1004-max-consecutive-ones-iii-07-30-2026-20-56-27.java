class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen=0;
        int n=nums.length;
        int zero,len;
        for(int i=0;i<n;i++){
            zero=0;
            for(int j=i;j<n;j++){
                if(nums[j]==0){
                    zero++;
                }
                if(zero<=k){
                    len=j-i+1;
                    maxLen=Math.max(maxLen,len);
                }
                else{
                    break;
                }
            }
        }
        return maxLen;
    }
}